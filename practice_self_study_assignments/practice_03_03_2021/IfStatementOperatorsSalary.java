package practice_self_study_assignments.practice_03_03_2021;
import java.util.Scanner;
public class IfStatementOperatorsSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary amount");
        int salary = scan.nextInt();
        System.out.println("Are you a full time employee? true or false?");
        boolean fullTimeOrNot = scan.nextBoolean();
        if (fullTimeOrNot) {
            System.out.println("Your final salary is $" + (salary + 2000));
        } else {
            System.out.println("Your final salary is $" + (salary - 5000));
        }
    }
}
