import task3

data1 = "Петрович Г.Г. P0000\nТестович Р.Е. P3111\n"
answ1 = "Тестович Р.Е. P3111\n"

data2 = "Григор Н.Н. P0000\nКорчагин Б.Б. P0000\n"
answ2 = ""

data3 = "Смирнов В.А. P2149\nКузнецова Е.Л. P2149т\nЧернов И.Г. P2149\n"
answ3 = "Смирнов В.А. P2149\nКузнецова Е.Л. P2149т\nЧернов И.Г. P2149\n"

data4 = "Борисова О.К. P2149\nОрлова М.И. P1203\n"
answ4 = "Борисова О.К. P2149\nОрлова М.И. P1203\n"

data5 = "Юдин П.Л. P1203\nФедорова Л.Н. P1203\nВасильев Р.К. P1203\n"
answ5 = "Юдин П.Л. P1203\nФедорова Л.Н. P1203\nВасильев Р.К. P1203\n"

if answ1 == task3.solve(data1):
    print("test1 passed")

if answ2 == task3.solve(data2):
    print("test2 passed")

if answ3 == task3.solve(data3):
    print("test3 passed")

if answ4 == task3.solve(data4):
    print("test4 passed")

if answ5 == task3.solve(data5):
    print("test5 passed")