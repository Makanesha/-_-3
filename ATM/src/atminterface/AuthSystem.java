package atminterface;

import java.util.HashMap;
import java.util.Scanner;

public class AuthSystem {

    private HashMap<String, User> users;

    public AuthSystem() {
        users = new HashMap<>();
    }

    public void register() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a new User ID: ");
        String userId = sc.nextLine();
        if (users.containsKey(userId)) {
            System.out.println("User ID already exists. Try again.");
            return;
        }
        System.out.print("Set your PIN: ");
        String pin = sc.nextLine();
        users.put(userId, new User(userId, pin));
        System.out.println("Registration successful!");
    }

    public User login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();
        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();
        User user = users.get(userId);
        if (user != null && user.getUserPin().equals(pin)) {
            System.out.println("Login successful!");
            return user;
        } else {
            System.out.println("Invalid credentials. Try again.");
            return null;
        }
    }

    public User getUser(String userId) {
        return users.get(userId);
    }
}
