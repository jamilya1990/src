package practice_self_study_assignments.practice_03_03_2021;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers to compare:");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        if (num1 == num2 && num1 == num3) {
            System.out.println("All integers are the same");
        } else if (num1 > num2 && num1 > num3) {
            System.out.println("The biggest number from " + num1 + ", " + num2 + " and " + num3 + " is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The biggest number from " + num1 + ", " + num2 + " and " + num3 + " is: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("The biggest number from " + num1 + ", " + num2 + " and " + num3 + " is: " + num3);
        } else if (num1 == num2 && num1 > num3) {
            System.out.println("The biggest number from " + num1 + ", " + num2 + " and " + num3 + " is: " + num1);
        } else if (num2 == num3 && num2 > num1) {
            System.out.println("The biggest number from " + num1 + ", " + num2 + " and " + num3 + " is: " + num2);
        } else if (num1 == num3 && num1 > num2) {
            System.out.println("The biggest number from " + num1 + ", " + num2 + " and " + num3 + " is: " + num1);
        }
    }
}