package BankManagementSystem;

public class Client extends User {
    private final String accountNumber; // (unique)
    private final String username;
    private final String password;
    private String phoneNumber;
    private final String accountState; //  (Active or Closed)
    private final String typeOfAccount; // (Savings or Current)
    private double balance;

    public Client(String ID, String firstName, String lastName, String accountNumber, String username, String password, String phoneNumber, String accountState, String typeOfAccount, double balance) {
        super(ID, firstName, lastName);
        this.accountNumber = accountNumber;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.accountState = accountState;
        this.typeOfAccount = typeOfAccount;
        this.balance = balance;
    }

    public void editPersonalInformation(String newPhoneNumber) {
        // Implement logic to edit personal information
        this.phoneNumber = newPhoneNumber;
        System.out.println("Personal information updated successfully.");
    }

    public String getID() {
        return ID;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + typeOfAccount);
        System.out.println("Balance: $" + balance);
    }

    public void transferMoney(double amount, Account recipientAccount) {
        // Implement logic for money transfer between accounts
        // This may involve updating the balances of both the sender and recipient
    }

    public void showTransactionHistory() {
        // Implement transaction history display logic
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // You can add other methods as needed for the Client class
}
