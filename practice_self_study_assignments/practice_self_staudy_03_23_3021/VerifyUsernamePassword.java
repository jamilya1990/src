package practice_self_study_assignments.practice_self_staudy_03_23_3021;

import java.util.Scanner;

public class VerifyUsernamePassword {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Username");
        String username = scan.next();
        System.out.println("Enter Password:");
        String password = scan.next();
        if (password.length() >= 5 && !password.contains(username)) {
            System.out.println("Valid Password");
        } else if (password.length() < 5){
            System.out.println("Password cannot be less than 5 characters");
        } else if (password.contains(username)) {
            System.out.println("Password cannot contain username");
        }
    }
}
