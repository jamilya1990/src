package java_programming_classes.day12_Conditional_Statements;

public class IfElseStatements {
    public static void main(String[] args) {
        if ('A' < 'B') { //can use char values in boolean of if statement
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        int count = 25;
        if (count >30) {
            System.out.println("Count is more than 30!");
        } else {
            System.out.println ("Not more than 30!");
        }
        int age = 25;
        if (age >= 18) { //if (CONDITION)
            System.out.println("You can vote!");
            System.out.println("Your age is over 18");
        } else {
            System.out.println("You are too young to vote!");
        }
    }
}
