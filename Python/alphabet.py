#this program is to find if the given character is alphabet
a = input("Enter a character:\n")
if ((a>='a' and a<='z') or (a>='A' and a<='Z')):
    print(a, "is an alphabet.")
else:
    print(a, " is not an alphabet.")