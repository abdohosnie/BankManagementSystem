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

//

    // You can add other methods as needed for the Employee class
}



