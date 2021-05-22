package practice_self_study_assignments.practice_03_03_2021;
import java.util.Scanner;
public class IfStatementOperatorsLeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Year:");
        int year = scan.nextInt();
        if (year % 4 == 0) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year:-)");
        }
    }
}
