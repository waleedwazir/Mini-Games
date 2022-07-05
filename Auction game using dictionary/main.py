from replit import clear
import art
#HINT: You can call clear() to clear the output in the console.
highest = {}
flag = True

def add_dict(name, bid):
  highest[name] = bid

def check_winner():
  score = 0
  winner = ""
  for key in highest:
    if highest[key] > score:
      score = highest[key]
      winner = key
  print(f"The winner is {winner} with a bid of {score}.")

print(art.logo)
print("Weclome to the Secret aution program.")

while flag:
  Name = input("What is your name?: ")
  Bid = int(input("What's your bid?: $"))
  add_dict(Name, Bid)
  redo = input("Are there any other bidders? Type 'yes' or 'no'.\n")
  if redo == "no":
    clear()
    check_winner()
    flag = False
  else:
    clear()




    
    




  



