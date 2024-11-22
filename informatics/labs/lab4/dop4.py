from time import * 
import yaml
import json

from main0_3 import yaml_to_json
from dop1 import yaml_to_json_library
from dop2 import yaml_to_json_regex

def test():
    start_0 = time()

    for i in range(100):
        yaml_to_json("timetable.yml", "timetable.json")
    end_0 = time() - start_0

    start_1 = time()
    for i in range(100):
        yaml_to_json_library("timetable.yml", "dop1timetable.json")
    end_1 = time() - start_1

    start_2 = time()
    for i in range(100):
        yaml_to_json_regex("timetable.yml", "dop2timetable.json")
    end_2 = time() - start_2

    print("default: ", end_0)
    print("with LIB: ", end_1)
    print("with regex: ", end_2)


test()
