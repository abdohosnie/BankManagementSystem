package BankManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankManagementSystem {
    private final List<Client> clients;
    private final List<Employee> employees;

    public BankManagementSystem() {
        this.clients = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public static void main(String[] args) {

    }

    public void initializeSystem() {


    }

    public void handleUserAuthentication() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter username: ");
//        String username = scanner.next();
//
//        System.out.println("Enter password: ");
//        String password = scanner.next();

    }

    private void showEmployeeMenu(Employee employee) {
        Scanner scanner = new Scanner(System.in);


    }

    private void createClientAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter client ID: ");
        String clientID = scanner.next();

        System.out.println("Enter client first name: ");
        String clientFirstName = scanner.next();

        System.out.println("Enter client last name: ");
        String clientLastName = scanner.next();
    }

    private void editClientAccount() {

    }

    private void searchClient() {

    }

    private void deleteClientAccount() {

    }

    private Client findClientByID(String clientID) {

        return null;
    }
}




