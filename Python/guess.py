# this program generates a random number and prompts the user to take a correct guess
import random
random_num = random.randint(1, 9) #generating a random number between 1 - 9 (including 1 and 9)
print(random_num)
num = int(input("Guess a number between the range of 1 to 9: "))
while True:
    if (num>=1 and num<=9):
        while (num!=random_num):
            num = int(input("Take another guess: "))
        print("Well guessed!")
        exit() #exit if only guessed correct number
    else:
        print("Out of range! Please guess between 1 to 9.") #continues to loop because of the "True" condition
        break