package java_programming_classes.day09_scanner_practice;
import java.util.Scanner;
public class SpeedCheckV2 {
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your current speed:");
        double currentSpeed = scan.nextDouble();
        System.out.println("What is the Speed Limit?");
        double speedLimit = scan.nextDouble();
        double overTheLimit = currentSpeed - speedLimit;
        System.out.println("Your Over the Limit speed is " + overTheLimit);

    }
}
