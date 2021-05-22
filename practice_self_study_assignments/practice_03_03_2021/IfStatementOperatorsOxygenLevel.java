package practice_self_study_assignments.practice_03_03_2021;
import java.util.Scanner;
public class IfStatementOperatorsOxygenLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your current Oxygen Level:");
        int oxygenLevel = scan.nextInt();
        String a = scan.next();
        if (oxygenLevel>=90) {
            System.out.println("Your tank is full!");
        } else if (oxygenLevel >= 80) {
            System.out.println("Still ok!");
        } else if (oxygenLevel >= 70) {
            System.out.println("Don't go too far!");
        } else if (oxygenLevel >= 60) {
            System.out.println("Start to head back!");
        } else if (oxygenLevel >= 50) {
            System.out.println("Be careful, now you are at 50%!");
        } else if (oxygenLevel < 50) {
            System.out.println("You are dangerously low in oxygen!");
        }
    }
}
