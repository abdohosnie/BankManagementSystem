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

    public void deposit(double amount) {

    }

    public void withdraw(double amount) {

    }

    // You can add other methods as needed for the Account class
}



