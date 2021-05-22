package java_programming_classes.day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0; // or just double bonus;
        double salesAmount = 2000.55;
        if (salesAmount <= 1000) {
            System.out.println("Good Job, you are qualified for bonus!");
            bonus = 50; //conditional value assignment
        } else {
            System.out.println("Great Job! You are qualified for full bonus!");
            bonus = 100; //conditional value assignment
        }
        System.out.println("Your bonus is $" + bonus);
    }
}
