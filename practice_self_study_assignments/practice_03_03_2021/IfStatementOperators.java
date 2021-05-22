package practice_self_study_assignments.practice_03_03_2021;

import java.util.Scanner;

public class IfStatementOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you age:");
        int age = scan.nextInt();
        boolean ageToVote = age >= 18;
        if (ageToVote) {
            System.out.println("Eligible to vote!");
        } else {
            System.out.println("Not Eligible to vote!");
        }
    }
}
