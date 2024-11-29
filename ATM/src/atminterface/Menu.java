package atminterface;

import java.util.Scanner;

public class Menu {
	public static void displayMainMenu(User user, AuthSystem authSystem) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Check Balance");
            System.out.println("6. Quit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    user.getTransactionHistory().displayTransactions();
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    Operations.withdraw(user, withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    Operations.deposit(user, depositAmount);
                    break;
                case 4:
                    System.out.print("Enter recipient User ID: ");
                    String recipientId = sc.next();
                    User recipient = authSystem.getUser(recipientId);
                    if (recipient != null) {
                        System.out.print("Enter amount to transfer: ");
                        double transferAmount = sc.nextDouble();
                        Operations.transfer(user, recipient, transferAmount);
                    } else {
                        System.out.println("Recipient not found.");
                    }
                    break;
                case 5:
                    System.out.println("Your current balance is: $" + user.getBalance());
                    break;
                case 6:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 6);
    }

}
