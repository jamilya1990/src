package java_programming_classes.day05_primitives_concatanation;

public class jobDescription {
    public static void main(String[] args) {
        String title = "Java SDET";
        String company = "Amazon";
        String jobDescription = "Test Automation";
        double salary = 150000.500;
        byte yearsExp = 7;
        boolean hasBenefits = true;

        System.out.println("My job title is " + title + " in company named " + company
                + "\nThe job I perform is " + jobDescription
                + "\nMy salary is $" + salary + " yearly." + "\nI have " + yearsExp
                + " years of experience."
                + "\nIs it true, that your company pays you full benefits? -" + hasBenefits);
    }
}
