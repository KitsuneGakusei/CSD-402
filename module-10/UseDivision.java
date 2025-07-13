public class UseDivision {
    public static void main(String[] args) {
        // International Division Instances
        InternationalDivision intlDiv1 = new InternationalDivision(
            "Asia-Pacific Operations", "AP-1001", "Japan", "Japanese");
        InternationalDivision intlDiv2 = new InternationalDivision(
            "Global Logistics", "GL-1002", "Japan", "Japanese");

        // Domestic Division Instances (using Japanese prefecture names for fun/consistency)
        DomesticDivision domDiv1 = new DomesticDivision(
            "Osaka Regional Support", "OS-2001", "Osaka");
        DomesticDivision domDiv2 = new DomesticDivision(
            "Kansai Area Sales", "KA-2002", "Kyoto");

        // Displaying the division details
        intlDiv1.display();
        intlDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
