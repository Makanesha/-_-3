1. ATM INTERFACE
Overview
This project is a console-based ATM system that includes user registration, login, and core banking functionalities. It is designed with five distinct classes and supports multiple operations: transaction history, withdrawal, deposit, fund transfer, and balance inquiry.

Features:

Registration:
Allows new users to create an account by providing a unique User ID and PIN.
Ensures that User IDs are not duplicated.

Login:
Existing users can log in with their User ID and PIN.
Successful login grants access to ATM functionalities.

Transaction History:
Displays a list of all transactions, including withdrawals, deposits, and transfers.

Withdraw:
Allows users to withdraw a specified amount if sufficient balance is available.

Deposit:
Enables users to deposit funds into their account, updating their balance.

Transfer:
Facilitates fund transfer to another user’s account.
Validates the recipient's existence and ensures sufficient balance for the transfer.

Check Balance:
Displays the current balance of the user’s account.

Quit:
Logs out the user and returns them to the main menu.

Project Structure:
MainATM.java-Entry point of the application.
Handles user interaction and navigation between registration, login, and main menu.

AuthSystem.java-Manages user registration and login processes.
Stores and retrieves user accounts and credentials.

Menu.java-isplays the ATM menu options.
Invokes corresponding operations based on user input.

User.java-Represents a user account with attributes like User ID, PIN, balance, and transaction history.

Operations.java-Contains the core banking operations: withdrawal, deposit, transfer, and transaction history management.

TransactionHistory.java-Maintains a log of a user's transaction records.

---------------------------------------------------------------------------------------------

2. GuessTheNumber Game
   
   Description
Guess the Number is a simple Java-based game where the computer generates a random number between 1 and 100. The player has to guess the number within a limited number of attempts. The game gives feedback on whether the guess is "Too High", "Too Low", "Close", or "Too Close". If the player guesses the correct number, they win and can restart the game with a new number.

The game provides a dynamic user interface with a black, white, and green theme for a clean and modern look. The number of attempts, score, and feedback are updated as the player progresses through the game.

Features:

Random Number Generation: The computer generates a random number between 1 and 100 for the player to guess.

Feedback: The game provides feedback on whether the guess is too high, too low, or close to the target number.

Attempts Limit: The player has 10 attempts to guess the number.

Score System: Players score points based on correct guesses and are rewarded with additional score for correct guesses within fewer attempts.

Dynamic UI: Clean, modern black, white, and green-themed UI with easy-to-read fonts and labels.

Game Restart: The game can be restarted after a win or game over.

Winning Feedback: Upon winning, feedback displays the number of attempts left and the correct number
