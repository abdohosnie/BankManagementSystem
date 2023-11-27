package BankManagementSystem;

public class Employee extends User {
    private String address;
    private String position;
    private final String graduatedCollege;
    private final int yearOfGraduation;
    private final String totalGrade;

    public Employee(String ID, String firstName, String lastName, String address, String position, String graduatedCollege, int yearOfGraduation, String totalGrade) {
        super(ID, firstName, lastName);
        this.address = address;
        this.position = position;
        this.graduatedCollege = graduatedCollege;
        this.yearOfGraduation = yearOfGraduation;
        this.totalGrade = totalGrade;
    }

    public void editPersonalInformation(String newAddress, String newPosition) {
        this.address = newAddress;
        this.position = newPosition;
        System.out.println("Personal information updated successfully.");
    }

    public void createClientAccount(String clientID, String clientFirstName, String clientLastName, String accountNumber, String username, String password, String telephoneNumber, String accountState, String typeOfAccount, double balance) {
        try {
            // Perform validations if needed

            Client newClient = new Client(clientID, clientFirstName, clientLastName, accountNumber, username, password, telephoneNumber, accountState, typeOfAccount, balance);
            // Add the new client to the list of clients
            // clients.add(newClient);

            System.out.println("Client account created successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void editClientAccount(Client client, String newTelephone) {

    }

    public void searchClient(String searchQuery) {
        // Implement search client logic based on the searchQuery
    }

    public void deleteClientAccount(Client client) {
        // Implement logic to delete a client account
    }

    // You can add other methods as needed for the Employee class
}



