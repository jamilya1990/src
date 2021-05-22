package java_programming_classes.day12_Conditional_Statements;

public class ComparisonExamplesV2 {
    public static void main(String[] args) {
        double accountBalance = 250.25;
        double itemPrice = 100;
        itemPrice += 125;
        itemPrice += 50;
        System.out.println("What is item price? " + itemPrice + "\nCan I afford it? " + (accountBalance >= itemPrice));
        accountBalance -= itemPrice;
        //accountBalance = accountBalance - itemPrice;
        System.out.println("Your Current Balance is " + accountBalance);
        boolean isBroke = accountBalance <= 0;
        System.out.println("Are you broke? " + isBroke);
        //OR without boolean isBroke variable
        System.out.println("Are you really broke? " + (accountBalance<=0));


    }
}
