package practice_self_study_assignments.practice_Self_Study_03_20_21;
import java.util.Scanner;
public class UpperOrLowerCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your letter");
        char letter = scan.next().charAt(0);
        String upperOrLowerCase = letter >= 97 ? "lowercase" : "uppercase";
        System.out.println(letter + " is " + upperOrLowerCase);
    }
}
