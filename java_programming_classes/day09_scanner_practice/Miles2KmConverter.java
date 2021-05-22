package java_programming_classes.day09_scanner_practice;
import java.util.Scanner;
public class Miles2KmConverter {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Miles to convert:");
        double miles = scan.nextDouble();
        double km = miles * 1.609;
        System.out.println("Kilometers in Mile:\t" + km);

    }
}
