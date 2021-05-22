package practice_self_study_assignments.practice_03_03_2021;

import java.util.Scanner;
//Write a java program that accepts three numbers and return the minimum number (assume that none of them are equal)
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 number to compare:");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        if (num1 < num2 && num1 < num3) {
            System.out.println(num1 + " smallest number");
        } else if (num2 < num1 && num2 < num3) {
            System.out.println(num2 + " smallest number");
        } else {
            System.out.println(num3 + " smallest number");
        }
    }
}
