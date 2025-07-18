// Name: Crystal Long
// Date: July 12, 2025
// Assignment: M10: Programming Assignment
// Purpose: Implements the DomesticDivision subclass with state-specific division information.

public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String divisionName, String accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division:");
        System.out.println("Name: " + divisionName);
        System.out.println("Account #: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}