import re
# Использование регулярных выражений
def yaml_to_json_regex(yaml_file, json_file):
    def parse_yaml_with_regex(yaml_content):
        data = {}
        current_day = None
        current_lesson = None

        # Разбираем YAML по строкам
        for line in yaml_content.splitlines():
            line = line.strip()
            if not line:
                continue

            # Ищем день недели
            day_match = re.match(r"^([A-Za-z]+):$", line)
            if day_match:
                current_day = day_match.group(1)
                if current_day not in data:
                    data[current_day] = {}  # Инициализация дня
                continue

            # Ищем урок
            lesson_match = re.match(r"^(lesson\d+):$", line)
            if lesson_match:
                current_lesson = lesson_match.group(1)
                if current_day and current_day in data:
                    if current_lesson not in data[current_day]:
                        data[current_day][current_lesson] = {}  # Инициализация урока
                continue

            # Ищем ключ-значение, при этом проверяем, если это вложенный объект
            kv_match = re.match(r"^(\w+):\s*(.*)$", line)
            if kv_match:
                key = kv_match.group(1)
                value = kv_match.group(2)

                # Проверяем если текущий ключ указывает на вложенный объект
                if value.startswith("{") and value.endswith("}"):
                    # Это вложенный объект, начинаем новый уровень вложенности
                    value = {}

                # Если текущий день и урок существуют, добавляем данные
                if current_day and current_lesson and current_day in data:
                    if current_lesson not in data[current_day]:
                        data[current_day][current_lesson] = {}

                    # Добавляем или обновляем ключ-значение
                    data[current_day][current_lesson][key] = value

        return data

    # Функция для преобразования словаря в читаемый формат JSON
    def dict_to_json(dictionary, indent=0):
        result = "{\n"
        for key, value in dictionary.items():
            result += " " * (indent + 4) + f'"{key}": '
            if isinstance(value, dict):
                result += dict_to_json(value, indent + 4)
            else:
                result += f'"{value}"'
            result += ",\n"
        result = result.rstrip(",\n") + "\n" + " " * indent + "}"
        return result

    # Чтение YAML файла
    with open(yaml_file, "r", encoding="utf-8") as file:
        yaml_content = file.read()

    # Парсинг YAML 
    parsed_data = parse_yaml_with_regex(yaml_content)

    # Преобразование в формат JSON
    json_data = dict_to_json(parsed_data)

    # Запись результата в файл
    with open(json_file, "w", encoding="utf-8") as file:
        file.write(json_data)

    print("Файл преобразован в формат JSON!")

# Вызов функции
yaml_to_json_regex("timetable.yml", "dop2timetable.json")
