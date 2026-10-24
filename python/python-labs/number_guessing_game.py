import random

print("Welcome to the Number Guessing Game!")
print("I'm thinking of a number between 1 and 100.")
print("You have 5 chances to guess the correct number.")
print("")
print("Please select the difficulty level:")
print("1. Easy (10 chances)")
print("2. Medium (5 chances)")
print("3. Hard (3 chances)")

difficulty = int(input("Enter your choice: "))

if(difficulty == 1):
    print("Great! You have selected the Easy difficulty level.")
    i = 1
    ranNum = random.randint(1, 100)

    while i <= 10:
    
        print(ranNum)
        num = int(input("Enter a number between 1 - 100: "))
        if num == ranNum:
            print("Congratulations! You guessed the correct number in " + str(i) + " attempts.")
            break
        else:
            if(num < ranNum):
                print("Incorrect! The number is greater than " + str(num) + ".")
            elif(num > ranNum):
                print("Incorrect! The number is less than " + str(ranNum) + ".")
                

        i += 1
elif (difficulty == 2):
        print("Great! You have selected the Medium difficulty level.")
        i = 1
        ranNum = random.randint(1, 100)
    
        while i <= 5:
        
            print(ranNum)
            num = int(input("Enter a number between 1 - 100: "))
            if num == ranNum:
                print("Congratulations! You guessed the correct number in " + str(i) + " attempts.")
                break
            else:
                if(num < ranNum):
                    print("Incorrect! The number is greater than " + str(num) + ".")
                elif(num > ranNum):
                     print("Incorrect! The number is less than " + str(num) + ".")
    
            i += 1
elif(difficulty == 3):
        print("Great! You have selected the Hard difficulty level.")
        i = 1
        ranNum = random.randint(1, 100)
    
        while i <= 3:
        
            print(ranNum)
            num = int(input("Enter a number between 1 - 100: "))
            if num == ranNum:
                print("Congratulations! You guessed the correct number in " + str(i) + " attempts.")
                break
            else:
                if(num < ranNum):
                    print("Incorrect! The number is greater than " + str(num) + ".")
                elif(num > ranNum):
                    print("Incorrect! The number is less than " + str(num) + ".")
    
            i += 1
