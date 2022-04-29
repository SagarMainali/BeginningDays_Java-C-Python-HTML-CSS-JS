#this program is to print either the multiple of 2 or 3 based on the input of the user
i = 1
a = int(input("Enter a number:\n"))
if a%2==0:
    while i<=10:
        print("2 * ",i," = ",2*i)
        i = i+1
elif a%3==0:
    while i<=10:
        print("3 * ",i,"=",3*i)
        i = i+1