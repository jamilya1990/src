package java_programming_classes.day49_static;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount();
        user1.spend(90);
        user1.showBalance();

        BankAccount user2 = new BankAccount();
        user2.spend(50);
        user2.showBalance();
        //System.out.println("BankAccount.balance = " + BankAccount.balance);
    }
}
