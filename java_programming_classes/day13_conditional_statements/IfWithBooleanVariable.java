package java_programming_classes.day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = false;
        if (isHungry == true) {
            System.out.println("I an hungry! I will go get something to eat\nThen code java!");
        } else {
            System.out.println("I am not hungry\nLet's keep coding java!");
        }

        double price = 130.44;
        boolean isAffordable = price <=200;
        if (isAffordable) {
            System.out.println("You can buy it");
        } else {
            System.out.println("You cannot buy it!");
        }

        boolean isRemoteJob = true;
        if (isRemoteJob != true) {
            System.out.println("Sorry I am not interested!");
        } else {
            System.out.println("Sure, I am interested, what is interview process");
        }
    }
}
