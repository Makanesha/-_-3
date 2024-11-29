package atminterface;

import java.util.ArrayList;

public class TransactionHistory {
    private ArrayList<String> transactions;

    public TransactionHistory() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(String transaction) {
        transactions.add(transaction);
    }

    public void displayTransactions() {
        System.out.println("Transaction History:");
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }
}

