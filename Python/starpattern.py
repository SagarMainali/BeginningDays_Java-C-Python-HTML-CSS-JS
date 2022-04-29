# displaying triangle pattern

#creating a function 
def trianglepattern(row):
    print("Below is the triangle pattern:")
    for x in range(0, 8):
        for y in range(0, x+1):
            print("*",end='')
        print("\n")
row = 8
#calling the function 
trianglepattern(row)