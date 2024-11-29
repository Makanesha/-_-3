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
