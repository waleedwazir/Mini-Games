import random

rock = '''
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
'''

paper = '''
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)
'''

scissors = '''
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
'''

#Write your code below this line 👇
player1 = int(input("What do you choose? Type 0 for Rock, 1 for Paper, 2 for Scissors.\n"))

computer = random.randint(0, 2)

if player1 == 0:
  print(f"You have choosen Rock\n {rock}")
elif player1 == 1:
   print(f"You have choosen Paper\n {paper}")
elif player1 == 2:
   print(f"You have choosen Scissors\n {scissors}")

if computer == 0:
  print(f"Computer has choosen Rock\n {rock}")
elif computer == 1:
   print(f"Computer has choosen Paper\n {paper}")
elif computer == 2:
   print(f"Computer has choosen Scissors\n {scissors}")

if player1 == computer:
  print("Draw!")
elif (player1 == 0) and (computer == 1) or (player1 == 1) and (computer == 2) or (player1 == 2) and (computer == 0):
  print("computer Wins!")
elif (player1 == 1) and (computer == 0) or (player1 == 2) and (computer == 1) or (player1 == 0) and (computer == 2):
  print("Player Wins!")