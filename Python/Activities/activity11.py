fruits ={  
    "apple": 10,
    "banana": 15,
    "orange": 8,
    "peaches": 15
}
 
key_to_check = input("What are you looking for? ").lower()
 
if(key_to_check in fruits):
    print("Yes, this is available")
else:
    print("No, this is not available")