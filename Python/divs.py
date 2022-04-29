#this program is to check either the value input from user is divisible by 4 or 7
a = int(input("Enter a number "))
if (a%4==0 and a%7==0):
    print("the value is divisible by both 4 and 7.")
else:
    print("the value is not divisible by either 4 or 7 or both")