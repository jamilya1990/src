package java_programming_classes.day24_loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(101);
        System.out.println("Enter your number:");
        int guessingNumber = scan.nextInt();
        do {
            if (guessingNumber > secretNumber){
                System.out.println("Wrong, your number is too high!");
            } else {
                System.out.println("Wrong, Your number is too low!");
            }
            guessingNumber = scan.nextInt();
        } while (secretNumber !=guessingNumber);
        System.out.println("You guessed correctly!");
    }
}
