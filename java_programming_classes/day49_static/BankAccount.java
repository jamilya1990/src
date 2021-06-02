package java_programming_classes.day49_static;

public class BankAccount {
    double balance = 500.00;
    String user;

    public void spend(double amount){
        System.out.println("Spending - " + amount);
        balance -=amount;
    }
    public void showBalance(){
        System.out.println("Show balance " + balance);
    }
}
