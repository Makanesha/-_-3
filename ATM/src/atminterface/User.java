package atminterface;

public class User {
	   private String userId;
	    private String userPin;
	    private double balance;
	    private TransactionHistory transactionHistory;

	    public User(String userId, String userPin) {
	        this.userId = userId;
	        this.userPin = userPin;
	        this.balance = 0.0;
	        this.transactionHistory = new TransactionHistory();
	    }

	    public String getUserId() {
	        return userId;
	    }

	    public String getUserPin() {
	        return userPin;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public TransactionHistory getTransactionHistory() {
	        return transactionHistory;
	    }

}
