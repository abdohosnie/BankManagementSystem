package BankManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Client extends User {
    private final String accountNumber; // (unique)
    private final String username;
    private final String password;
    private String phoneNumber;
    private final String accountState; //  (Active or Closed)
    private final String typeOfAccount; // (Savings or Current)
    private double balance;
    private final List<Account> accounts;

    public Client(String ID, String firstName, String lastName, String accountNumber, String username, String password, String phoneNumber, String accountState, String typeOfAccount, double balance) {
        super(ID, firstName, lastName);
        this.accountNumber = accountNumber;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.accountState = accountState;
        this.typeOfAccount = typeOfAccount;
        this.balance = balance;
        this.accounts = new ArrayList<>();
    }

    public void editPersonalInformation(String newPhoneNumber) {

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

    }

    public void showTransactionHistory() {
        // Implement transaction history display logic
    }

    public void takeDeposit(double amount) {


    }

    // You can add other methods as needed for the Client class
}



