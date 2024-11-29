package atminterface;

import java.util.Scanner;
public class MainATM {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the ATM System!");

        // Initialize the Authentication System
        AuthSystem authSystem = new AuthSystem();
        User currentUser = null;

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    authSystem.register();
                    break;
                case 2:
                    currentUser = authSystem.login();
                    if (currentUser != null) {
                        Menu.displayMainMenu(currentUser, authSystem);
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the ATM System!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}

