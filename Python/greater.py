#program to print greatest among two integers, taken input from the user
a=input("Enter first number\n")
b=input("Enter second number\n")
a=int(a)
b=int(b)
if a>b:
    print(a, "is greater than ",b)
elif b>a:
    print(b, "is greater than ",a)
else:
    print(a," and ", b, "are equal")    