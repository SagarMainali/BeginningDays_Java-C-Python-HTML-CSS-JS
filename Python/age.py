#this program finds the year when the user will be 100 years by asking him/her their age

name = input("Enter your name: ")
age = int(input("Enter your age: "))
current_year = 2021
if age<100:
    hundred_in = 100 - age #this finds the year in which the user will be 100 years
    required_year = current_year + hundred_in #matching the above year with the actual year
    print("You are going to be 100 years in", required_year,"AD.")
else:
    print("You are already above 100 years. Please be born again!")