#this program finds out if a person is eligible to vote or not based on the birthyear s/he inputs
#x = int(input("Enter your birthyear:\n"))
x = input("Enter your birthyear:\n")
y = input("Enter the current year:\n")
a = int(x)
b = int(y)
c = b-a
if c>=18:
    print("You are ",c," years old. You can VOTE.")
else:
    print("You are just ",c," years old. You cannot VOTE.")