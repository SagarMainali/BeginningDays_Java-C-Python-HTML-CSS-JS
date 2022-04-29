#take 3digit number from the user and evaluate if they are odd or even and print their sum too
a=input("Enter three digit number\n")
a=int(a)
sum=0
r=0
while a>0:
 r=a%10
 sum=sum+r
 if(r%2==0):
     print(r, "is even")
 else:
     print(r, "is odd")
 a= int(a/10)
print("The sum is", sum)