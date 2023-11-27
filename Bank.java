package BankManagementSystem;

public class Bank {
    private final BankManagementSystem bankManagementSystem;

    public Bank() {
        this.bankManagementSystem = new BankManagementSystem();
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.start();
    }

    private void start() {
        // Initialization
        bankManagementSystem.initializeSystem();

        // User authentication
        bankManagementSystem.handleUserAuthentication();


    }
}