import yaml
import json

def yaml_to_json_library(yaml_file, json_file):
    with open(yaml_file, "r", encoding="utf-8") as file:
        data = yaml.safe_load(file)

    with open(json_file, "w", encoding="utf-8") as file:
        json.dump(data, file, ensure_ascii=False, indent=4)

    print("Файл преобразован с использованием библиотек!")

yaml_to_json_library("timetable.yml", "dop1timetable.json")
