# Exercise 1: Introducing the string data type
myString = "This is a string."
print(myString)
print(type(myString))
print(myString + " is of the data type " + str(type(myString)))
print("---------------------------")
# Exercise 2: Working with string concatenation
firstString = "water"
secondString = "fall"
thirdString = firstString + secondString
print(thirdString)
print("---------------------------")
# Exercise 2: Working with string concatenation
name = input("What is your name? ")
print(name)
# Exercise 4: Formatting output strings
color = input("What is your favorite color?")
animal = input("What is your favorite animal?")
print("{}, you like a {} {}!".format(name,color,animal))

