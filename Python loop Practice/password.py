password = "miracle"
user = input("enter password")
while user != password:
    user = input("enter password")
    if user == password:
        print("logged in successful")
        break

