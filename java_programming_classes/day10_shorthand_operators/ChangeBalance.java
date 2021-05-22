package java_programming_classes.day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);

        balance = balance - baklava;
        System.out.println("balance = " + balance);
        
        double kenafa = 44.45;
        System.out.println("kenafa = " + kenafa);
        balance = balance - kenafa;
        System.out.println("balance = " + balance);
        kenafa = kenafa / 2;
        System.out.println("kenafa = " + kenafa);
        balance = balance - kenafa;
        System.out.println("balance = " + balance);

        double icedTea = 3.0;
        balance = balance - icedTea * 4;
        System.out.println("balance = " + balance);
    }
}
