package atminterface;

public class Operations {
	 public static void withdraw(User user, double amount) {
	        if (amount <= 0 || amount > user.getBalance()) {
	            System.out.println("Invalid withdrawal amount, check balance.");
	        } else {
	            user.setBalance(user.getBalance() - amount);
	            user.getTransactionHistory().addTransaction("Withdrew: Rs." + amount);
	            System.out.println("Successfully withdrew Rs." + amount);
	        }
	    }

	    public static void deposit(User user, double amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid deposit amount.");
	        } else {
	            user.setBalance(user.getBalance() + amount);
	            user.getTransactionHistory().addTransaction("Deposited: Rs." + amount);
	            System.out.println("Successfully deposited Rs." + amount);
	        }
	    }

	    public static void transfer(User sender, User receiver, double amount) {
	        if (amount <= 0 || amount > sender.getBalance()) {
	            System.out.println("Invalid transfer amount.");
	        } else {
	            sender.setBalance(sender.getBalance() - amount);
	            receiver.setBalance(receiver.getBalance() + amount);
	            sender.getTransactionHistory().addTransaction("Transferred: Rs." + amount + " to User ID: " + receiver.getUserId());
	            receiver.getTransactionHistory().addTransaction("Received: Rs." + amount + " from User ID: " + sender.getUserId());
	            System.out.println("Successfully transferred Rs." + amount + " to User ID: " + receiver.getUserId());
	        }
	    }
	}
