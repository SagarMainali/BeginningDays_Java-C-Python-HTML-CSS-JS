#this is a program to reverse an integer given by the user
num = int(input("Enter a number:"))
count = int(0)
while (num > 0):
    num = num / 10
    count = count + 1
print(count)