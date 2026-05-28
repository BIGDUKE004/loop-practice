count = 1
user = int(input("enter number"))
num = user
while count <= 4:
    user = int(input("enter number"))
    count = count + 1
    if user < num:
        num = user

print(num)
    
