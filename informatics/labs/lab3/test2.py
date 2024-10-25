import task2
str1 = "Кривошеее существо гуляет по парку"
answ1 = ["гуляет"]

str2 = "Петя и Маша гуляют в парке"
answ2 = ["гуляют"]

str3 = "Медленно пробираюсь сквозь холодный вечер"
answ3 = []

str4 = "Я в этом мире настолько преисполнился"
answ4 = []

str5 = "У лукоморья дуб зелёный Златая цепь на дубе том: и днем и ночью кот ученый"
answ5 = ["Златая"]


if answ1 == task2.solve(str1):
    print("test1 passed")

if answ2 == task2.solve(str2):
    print("test2 passed")

if answ3 == task2.solve(str3):
    print("test3 passed")

if answ4 == task2.solve(str4):
    print("test4 passed")

if answ5 == task2.solve(str5):
    print("test5 passed")