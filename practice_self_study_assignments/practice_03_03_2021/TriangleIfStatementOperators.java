package practice_self_study_assignments.practice_03_03_2021;
import java.util.Scanner;
public class TriangleIfStatementOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Angle:");
        int firstAngle = scan.nextInt();
        System.out.println("Enter Second Angle:");
        int secondAngle = scan.nextInt();
        System.out.println("Enter Third Angle:");
        int thirdAngle = scan.nextInt();
        int sumOfAngles = firstAngle + secondAngle + thirdAngle;
        boolean isTriangle = sumOfAngles == 180;
        if (isTriangle) {
            System.out.println("Valid Triangle: sum of all 3 angles is equal to " + sumOfAngles);
        } else {
            System.out.println("Not a Valid Triangle: sum of all 3 angles is equal to " + sumOfAngles
            + ", but it has to be equal to 180!");
        }
    }
}
