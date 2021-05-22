package practice_self_study_assignments.practice_03_03_2021;
import java.util.Scanner;
public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month's number:");
        int month = scan.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } else if (month == 2) {
            System.out.println("28 days");
        } else {
            System.out.println("30 days");
        }
    }

}
