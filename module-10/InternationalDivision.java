// Name: Crystal Long
// Date: July 12, 2025
// Assignment: M10: Programming Assignment
// Purpose: Implements the InternationalDivision subclass with country and language-specific division information.

public class InternationalDivision extends Division {
    private String country;
    private String language;

    public InternationalDivision(String divisionName, String accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division:");
        System.out.println("Name: " + divisionName);
        System.out.println("Account #: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}
