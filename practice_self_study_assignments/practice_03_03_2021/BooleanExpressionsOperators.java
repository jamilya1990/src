package practice_self_study_assignments.practice_03_03_2021;
import java.util.Scanner;
public class BooleanExpressionsOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
        int enteredNumber = scan.nextInt();
        boolean divisibleBy2 = enteredNumber % 2 == 0;
        System.out.println(enteredNumber + " is divisible by 2: " + divisibleBy2);
        boolean divisibleBy3 = enteredNumber % 3 == 0;
        System.out.println(enteredNumber + " is divisible by 3: " + divisibleBy3);
        boolean divisibleBy5 = enteredNumber % 5 == 0;
        System.out.println(enteredNumber + " is divisible by 5: " + divisibleBy5);
    }
}
