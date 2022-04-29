#racetrack time program

#taking input
number = int(input("\nEnter the number of times you ran through the racetrack: "))
lap = []
for x in range(number):
    time = int(input("Enter the time taken in seconds to complete Lap{}: ".format(x+1)))
    lap.append(time)

#displaying the result
print("The fastest lap time is {} seconds".format(min(lap)))
print("The slowest lap time is {} seconds".format(max(lap)))
print("The average lap time is {} seconds".format(sum(lap)/number))