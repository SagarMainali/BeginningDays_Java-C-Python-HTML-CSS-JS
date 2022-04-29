#program to find greatest among three given nuumbers from user
a = input("Enter the first number:\n")
b = input("Enter the second number:\n")
c = input("Enter the third number:\n")
if a>b and a>c:
    print(a, " is the greatest.")
elif b>c and b>a:
    print(b, " is the greatest.")
elif c>a and c>b:
    print(c, " is the greatest.")
else:
    print("All are equal.")