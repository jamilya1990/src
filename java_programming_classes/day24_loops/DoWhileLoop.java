package java_programming_classes.day24_loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int count =100;
        do {
            System.out.println("counter = " + count);
            count++;
        } while (count <= 10);
        Scanner scan = new Scanner(System.in);
        int secretPINCode = 1234;
        System.out.println("Enter your Pin Code");
        int pinCode = scan.nextInt();
        do {
            System.out.println("Your Pin Code is incorrect! Try again:");
            pinCode = scan.nextInt();
        } while (pinCode != secretPINCode);
        System.out.println("Your pin is correct!");
    }
}
