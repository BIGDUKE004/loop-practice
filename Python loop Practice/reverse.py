# Reverse a string manually....pick the words one by one and add it to an empty variable...
total = ""
user = input("enter a word: ")
for number in range(len(user), 0, -1):
        total = total + user[number -1]
if total == user:
    print("it is a palindrome")
else:
    print("it is not a palindrome")
