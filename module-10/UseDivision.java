public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision intl1 = new InternationalDivision("Global Sales", 1001, "Japan", "Japanese");
        InternationalDivision intl2 = new InternationalDivision("Europe Marketing", 1002, "Germany", "German");

        DomesticDivision dom1 = new DomesticDivision("West Coast", 2001, "California");
        DomesticDivision dom2 = new DomesticDivision("East Coast", 2002, "New York");

        intl1.display();
        intl2.display();
        dom1.display();
        dom2.display();
    }
}
