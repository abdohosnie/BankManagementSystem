package BankManagementSystem;

public class User {
    private final String FirstName;
    private final String LastName;
    protected final String ID;

    public User(String ID, String firstName, String lastName) {
        this.ID = ID;
        this.FirstName = firstName;
        this.LastName = lastName;
    }

    public String getFullName() {
        return FirstName + " " + LastName;
    }
}