# count vowel letters in a word
# creat a variable to store the count
# collect input
# loop through the input
# if theres a vowel letter
# the counting variable plus one

counter = 0
user = input("enter a word: ")
for number in range(len(user)):
    if user[number - 1] == "a" or user[number - 1] == "e" or user[number - 1] == "i" or user[number - 1] ==  "o" or user[number - 1] == "u":
        counter += 1
print(counter)
