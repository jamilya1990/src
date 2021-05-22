package java_programming_classes.day34_method_with_parameters;

import java.util.Scanner;

public class MultipleParams {
    public static void showSum(double num1, double num2){
        System.out.println("The results = " + (num1 + num2));

    }

    public static void main(String[] args) {
        showSum(45, 8975);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        showSum(d1, d2);
    }
}
