package practice_self_study_assignments.practice_03_03_2021;
/*
Make a class Stage1Calculator
create a main method

    - Declare two double variables
    - Declare 5 more double variables for each operation.
        > Execute all the operation between the first two numbers
    - Print out operations
        Ex: if the nums are 5 and 10
            5 + 10 = 15
            5 - 10 = -5
            etc..
 */
public class Stage1Calculator {
    public static void main (String [] args) {
        double num1 = 5;
        double num2 = 10;

        double addition = num1 + num2;

// byte -> short - > int -> long -> float - > double
        double subtraction = num1 / num2;
        double remainders = num1 % num2;

        System.out.println(remainders);
        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " % " + num2 + " = " + remainders);
    }
}
