package java_programming_classes.day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15;
        double remainingBalance = balance - price1 - price2 - price3;
        System.out.println("Your remaining balance is " + remainingBalance);

        int balanceWithoutCents = (int) remainingBalance;
        System.out.println("Your remaining balance without cents is $" + balanceWithoutCents);
    }
}

