import task1

str1 = "skdjfsd939492[</[</sdf0dasl[</dsl,f3o[</"
answ1 = 4

str2 = "[</[</[</[</[</"
answ2 = 5

str3 = "Электрич[</еский чайник Smeg KLF0[</3CREU вып[</олнен в фирм[</енном стиле, вдохнов[</ленном лучшими обра[</зцами техники 50[</-х годов 20 века"
answ3 = 7

str4 = "안녕하[</[</세요 컴퓨[</터 과학"
answ4 = 3

str5 = "3940852dmc.zz z021 assax[][]aslcp[a[</asd,39[</3a.,m"
answ5 = 2

if answ1 == task1.solve(str1):
    print("test1 passed")

if answ2 == task1.solve(str2):
    print("test2 passed")

if answ3 == task1.solve(str3):
    print("test3 passed")

if answ4 == task1.solve(str4):
    print("test4 passed")

if answ5 == task1.solve(str5):
    print("test5 passed")






