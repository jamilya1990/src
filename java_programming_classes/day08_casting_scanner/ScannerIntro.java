package java_programming_classes.day08_casting_scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scan or input - doesn't matter
        System.out.println("Please enter your name:");
        String firstName = scan.next();
        System.out.println("nice to meet you, " + firstName);

        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        String age = scan.next();
        System.out.println("Is " + age + " more than 21? If Yes, then you can pass!");


    }
}
