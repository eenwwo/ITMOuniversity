import re

def yaml_to_json(yaml_file, json_file):
    def otstup(line):
        # Определяет уровень отступа в строке
        return len(line) - len(line.lstrip())

    def process_lines(lines):
        # Обрабатывает строки YAML и создает вложенный словарь
        root = {}  # Корневой объект
        stack = [(root, -1)]  # Стек: объект и его уровень отступа
        current_obj = root

        # Регулярное выражение для парсинга строки
        key_value_pattern = re.compile(r'^\s*(?P<key>[^:]+)\s*:\s*(?P<value>.*)$')

        for line in lines:
            stripped_line = line.strip()
            if not stripped_line:  # Пропуск пустых строк
                continue

            indent = otstup(line)

            match = key_value_pattern.match(line)
            if match:
                key = match.group("key").strip()
                value = match.group("value").strip()

                # Проверка, является ли значение пустым (вложенный объект)
                if value == "":
                    value = {}

                # Поднимаемся вверх по стеку, если уровень отступа меньше текущего
                while stack and stack[-1][1] >= indent:
                    stack.pop()

                # Если стек пуст, это ошибка в структуре YAML
                if not stack:
                    raise ValueError("Ошибка в структуре YAML: некорректные отступы.")

                # Добавляем текущий ключ-значение в текущий объект
                current_obj = stack[-1][0]
                if isinstance(value, dict):  # Для вложенного объекта
                    current_obj[key] = {}
                    stack.append((current_obj[key], indent))
                else:
                    current_obj[key] = value
            else:
                raise ValueError(f"Неправильный формат строки: {line}")

        return root

    # Чтение YAML-файла
    with open(yaml_file, "r", encoding="utf-8") as file:
        lines = file.readlines()

    # Преобразование в словарь
    data = process_lines(lines)

    # Преобразование в JSON-формат (читаемый вручную)
    def dict_to_json(dictionary, indent=0):
        result = "{\n"
        for key, value in dictionary.items():
            result += " " * (indent + 4) + f'"{key}": '
            # Если значение словарь, функция вызывает сама себя, увеличивая
            # уровень доступа на 4 (рекурсивная обработка вложенных словарей)
            # а если значение строка, добавляем в строку JSON в кавычках
            if isinstance(value, dict):
                result += dict_to_json(value, indent + 4)
            else:
                result += f'"{value}"'
            result += ",\n"
        # Удаление последней запятой, добавление закрывающей фигурной скобки
        # с нужным отступом
        result = result.rstrip(",\n") + "\n" + " " * indent + "}"
        return result

    json_data = dict_to_json(data)

    # Запись в JSON-файл
    with open(json_file, "w", encoding="utf-8") as file:
        file.write(json_data)

    print("Файл преобразован в формат JSON!")

# Вызов функции
yaml_to_json("timetable.yml", "dop2timetable.json")
