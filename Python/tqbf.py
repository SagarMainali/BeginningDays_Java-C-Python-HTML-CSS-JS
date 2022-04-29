[a_count, e_count, i_count, o_count, u_count] = [0,0,0,0,0]
str = input("Enter a sentence:\n")
a = str.lower()
for i in str:
    if i=='a':
        a_count+=1
    elif i=='e':
        e_count+=1
    elif i=='e':
        i_count+=1
    elif i=='o':
        o_count+=1
    elif i=='u':
        u_count+=1