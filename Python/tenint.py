#this program prints the sum of 10 integers taken from the user
print("Enter any 10 integers\n")
n = 1
sum = 0
while (n<=10):
    a = int(input())
    sum = sum + a
    n = n + 1
print(sum/10)
