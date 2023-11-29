package BankManagementSystem;

public class Account {
    private final String accountNumber; // (Unique)
    private final String type; // (Savings or Current)
    private double balance;

    public Account(String accountNumber, String type, double balance) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.balance = balance;
    }

    // You can add other methods as needed for the Account class
}