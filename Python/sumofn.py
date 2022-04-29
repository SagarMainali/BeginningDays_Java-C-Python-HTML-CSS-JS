#this program adds the natural numbers upto the value given by the user
n = int(input("Enter a number upto which you want to add:\n"))
a = 1
sum = 0
while a<=n:
    sum = sum + a
    a = a + 1
print(sum)