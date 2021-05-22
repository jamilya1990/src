package practice_self_study_assignments.practice_self_study_03_24_2021;

import java.util.Scanner;

public class CreatingAnEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 words and each at least 6 characters long:");
        String word1 = scan.next();
        String word2 = scan.next();
        if (word1.length()<6 || word2.length()<6) {
            System.out.println("Invalid Data.");
        } else {
            String word1First4Characters = word1.toLowerCase().substring(0, 4);
            String word2Last3Characters = word2.toLowerCase().substring(word2.length()-3);
            System.out.println("Suggested email address: " + word1First4Characters + word2Last3Characters + "@cybertek.com");
        }
    }
}
