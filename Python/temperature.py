# program to process a collection of daily temperatures

day = []
temperature = []

def Info(n):
    print("\nPlease enter {} days of temperature readings:".format(n))
    for i in range(n):
        day.append(int(input("Temperature day [{}] = ".format(i+1))))

def Evaluate(n):
    very_hot_day_count = 0
    cold_day_count = 0
    pleasant_day_count = 0
    for i in range(n):
        if day[i] > 85:
            temperature.append("Very hot day")
            very_hot_day_count =  very_hot_day_count + 1
        elif day[i] < 60:
            temperature.append("Cold day ")
            cold_day_count =  cold_day_count + 1
        elif day[i] >=  60 and day[i] <= 85:
            temperature.append("Pleasant day")
            pleasant_day_count =  pleasant_day_count + 1
        else:
            print("Invalid!")
    return very_hot_day_count, cold_day_count, pleasant_day_count 

def Calculate(n):
    sum = 0
    for i in range(n):
        sum = sum + day[i]
    average = sum/n
    return int(average)

def Display(n, avg, no_of_hot_days, no_of_cold_days, no_of_pleasant_days):
    print("-------------------------------------------")
    print("Daily Temperatures Report")
    print("-------------------------------------------")
    for i in range(n):
        print("Temperature day [{}] = {} Celcius - {}".format((i+1), day[i], temperature[i]))
    print("\nThe average temperature for {} days = {} Celcius".format(n, avg))
    print("Number of hot days      = {} days".format(no_of_hot_days))
    print("Number of pleasant days = {} days".format(no_of_pleasant_days))
    print("Number of cold days     = {} days\n".format(no_of_cold_days))

def main():
    no_of_days = int(input("\nHow many days to record? "))
    Info(no_of_days)
    no_of_hot_days, no_of_cold_days, no_of_pleasant_days = Evaluate(no_of_days)
    temp_avg = Calculate(no_of_days)
    Display(no_of_days, temp_avg, no_of_hot_days, no_of_cold_days, no_of_pleasant_days)

main()