package java_programming_classes.day12_Conditional_Statements;
import java.util.Scanner;
public class ComparisonExamples {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Current Speed:");

        int currentSpeed = scan.nextInt();
        System.out.println("Enter Speed Limit:");
        int speedLimit = scan.nextInt();
        //boolean isSpeeding = currentSpeed > speedLimit;
        //System.out.println("Are you speeding? " + isSpeeding);
        System.out.println("Are you speeding? " + (currentSpeed>speedLimit) + " mph");

        currentSpeed = 68;
        speedLimit = 55;
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? " + isSpeeding);
    }
}
