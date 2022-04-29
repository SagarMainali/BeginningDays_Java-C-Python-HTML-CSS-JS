#Income tax Calculator

print("\t\t\t\t____________________________________________________________________________________________\n")
print("\t\t\t\t\t\t\t\tIncome Tax Calculation System\n")
print("\t\t\t\t\t\t\t\t    Lazimpat, kathmandu")
print("\t\t\t\t____________________________________________________________________________________________\n")
print("\t\t\t\t\t\t\tWelcome to the Income Tax Calculation System")
print("\t\t\t\t_____________________________________________________________________________________________")
name = input("\n\nName: ")
address = input("Address: ")
age = int(input("Age: "))
print("____________________________")
m_income = int(input("Enter your monthly income: "))
m_sta = input("Are you married or unmarried? Please type 'Y' or 'N': ") #type 'Y' or 'N' 
a_income = m_income*12

#for individual
if m_sta=='N' or m_sta=='n':
    if a_income<=400000:
        tax1 = 1/100*a_income
        print("Your total tax amount:",tax1)
        total = a_income-tax1
        print("Your total salary after deducting tax is:",total)
    elif a_income>400000 and a_income<=500000:
        tax1 = 4000 #tax for upto 400000
        additional = a_income - 400000 #extra amount greater than 400000 and less than or equal to 500000
        tax2 = 10/100*additional #tax for that extra amount that is greater than 400000
        total_tax = int(tax1 + tax2) #total tax 
        print("Your total tax amount:",total_tax)
        total1 = int(a_income-total_tax) #salary after deducting tax on both 400000 and that extra amount
        print("Your total salary after deducting tax:",total1)
    elif a_income>500000 and a_income<=700000:
        tax1 = 14000 #tax for upto 500000
        additional = a_income - 500000 #extra amount greater than 500000 and less than or equal to 700000
        tax2 = 20/100*additional #tax for that extra amount that is greater than 500000
        total_tax = int(tax1 + tax2) #total tax 
        print("Your total tax amount:",total_tax)
        total1 = int(a_income-total_tax) #salary after deducting tax on both 500000 and that extra amount
        print("Your total salary after deducting tax:",total1)
    elif a_income>700000 and a_income<=2000000:
        tax1 = 54000 #tax for upto 700000
        additional = a_income - 700000 #extra amount greater than 700000 and less than or equal to 2000000
        tax2 = 30/100*additional #tax for that extra amount that is greater than 700000
        total_tax = int(tax1 + tax2) #total tax 
        print("Your total tax amount:",total_tax)
        total1 = int(a_income-total_tax) #salary after deducting tax on both 700000 and that extra amount
        print("Your total salary after deducting tax:",total1)
    elif a_income>2000000:
        tax1 = 444000 #tax for upto 2000000
        additional = a_income - 2000000 #extra amount greater than 2000000
        tax2 = 36/100*additional #tax for that extra amount that is greater than 2000000
        total_tax = int(tax1 + tax2) #total tax 
        print("Your total tax amount:",total_tax)
        total1 = int(a_income-total_tax) #salary after deducting tax on both 2000000 and that extra amount
        print("Your total salary after deducting tax:",total1)

#for couple
elif m_sta=='Y' or m_sta=='y':
    if a_income<=450000:
       tax1 = int(1/100*a_income)
       print("Your total tax amount:",tax1)
       total = int(a_income-tax1)
       print("Your total salary after deducting tax is:",total)
    elif a_income>450000 and a_income<=550000:
       tax1 = 4500 #tax for upto 450000
       additional = a_income - 450000 #extra amount greater than 450000 and less than or equal to 550000
       tax2 = 10/100*additional #tax for that extra amount that is greater than 450000
       total_tax = int(tax1 + tax2) #total tax 
       print("Your total tax amount:",total_tax)
       total1 = int(a_income-total_tax) #salary after deducting tax on both 450000 and that extra amount
       print("Your total salary after deducting tax:",total1)
    elif a_income>550000 and a_income<=750000:
        tax1 = 14500 #tax for upto 550000
        additional = a_income - 550000 #extra amount greater than 550000 and less than or equal to 750000
        tax2 = 20/100*additional #tax for that extra amount that is greater than 550000
        total_tax = int(tax1 + tax2) #total tax 
        print("Your total tax amount:",total_tax)
        total1 = int(a_income-total_tax) #salary after deducting tax on both 550000 and that extra amount
        print("Your total salary after deducting tax:",total1)
    elif a_income>750000 and a_income<=2000000:
        tax1 = 54500 #tax for upto 750000
        additional = a_income - 750000 #extra amount greater than 750000 and less than or equal to 2000000
        tax2 = 30/100*additional #tax for that extra amount that is greater than 750000
        total_tax = int(tax1 + tax2) #total tax 
        print("Your total tax amount:",total_tax)
        total1 = int(a_income-total_tax) #salary after deducting tax on both 750000 and that extra amount
        print("Your total salary after deducting tax:",total1)
    elif a_income>2000000:
        tax1 = 429500 #tax for upto 2000000
        additional = a_income - 2000000 #extra amount greater than 2000000
        tax2 = 36/100*additional #tax for that extra amount that is greater than 2000000
        total_tax = int(tax1 + tax2) #total tax 
        print("Your total tax amount:",total_tax)
        total1 = int(a_income-total_tax) #salary after deducting tax on both 2000000 and that extra amount
        print("Your total salary after deducting tax:",total1)

else:
    print("Invalid character!")