def check(string):
    if (set(string) != {"0", "1"} and set(string) != {"1", "0"}) or len(string) != 7:
        print("Строка должна состоять из 7 цифр 0 и 1")
        exit(1)

def syndr(n):
    s1 = (n[0] + n[2] + n[4] + n[6]) % 2
    s2 = (n[1] + n[2] + n[5] + n[6]) % 2
    s3 = (n[3] + n[4] + n[5] + n[6]) % 2
    return (s1, s2, s3)

def inf(n):
    return [bits[2], bits[4], bits[5], bits[6]]

def symbol(n):
    if index(bits) == 1:
        return "r1"
    elif index(bits) == 2:
        return "r2"
    elif index(bits) == 3:
        return "i1"
    elif index(bits) == 4:
        return "r3"
    elif index(bits) == 5:
        return "i2"
    elif index(bits) == 6:
        return "i3"
    else:
        return "i4"
def index(n):
    return int("".join(map(str, syndr(bits)[::-1])), 2)

f = input()
check(f)

bits = list(map(int, list(f)))

if syndr(bits) != (0, 0, 0) and symbol(bits)[0] == "r":
    print("В сообщении есть ошибка")
    print("Ошибка в символе ", symbol(bits))
    print("Правильное сообщение: ", str(bits[2]) + str(bits[4]) + str(bits[5]) + str(bits[6]))
elif syndr(bits) != (0, 0, 0) and symbol(bits)[0] != "r":
    ind = int(symbol(bits)[1]) - 1
    result = inf(bits)
    result[ind] = (result[ind] + 1) % 2
    print("Ошибка в символе ", symbol(bits))
    print("Правильное сообщение:", "".join(map(str, result)))
else:
    print("Ошибки нет")





