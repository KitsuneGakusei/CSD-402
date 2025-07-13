// Name: Crystal Long
// Date: July 12, 2025
// Assignment: M10: Programming Assignment
// Purpose: Defines the abstract base class for company divisions with common fields and an abstract display method.

public abstract class Division {
    protected String divisionName;
    protected String accountNumber;

    public Division(String divisionName, String accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}
