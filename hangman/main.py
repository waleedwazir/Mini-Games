import random
import hangman_art
import hangman_words

chosen_word = random.choice(hangman_words.word_list)
word_length = len(chosen_word)
check = []

end_of_game = False
lives = 6

logo = hangman_art.logo
print(f"{logo} \n")
stages = hangman_art.stages

#Create blanks
display = []
for _ in range(word_length):
    display.append("_")
print(f"The Word is: {' '.join(display)}\n\n")

while not end_of_game:
    guess = input("Guess a letter: \n").lower()

    #Check guessed letter
    for position in range(word_length):
        letter = chosen_word[position]
        if letter == guess:
            display[position] = letter
          
    if guess in check:
      print(f"You have already chosen {guess}, Please Try again!\n")

    check.append(guess)
    #Check if user is wrong.
    if guess not in chosen_word:
        print(f"{guess} is not is the word!\n")
        lives -= 1
        if lives == 0:
            end_of_game = True
            print("You lose.")

    #Join all the elements in the list and turn it into a String.
    print(f"The Word is: {' '.join(display)}")

    #Check if user has got all letters.
    if "_" not in display:
        end_of_game = True
        print("You win.")

    print(stages[lives])