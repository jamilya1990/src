package java_programming_classes.day09_scanner_practice;
import java.util.Scanner;

public class AskAgeV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" How old are your?");
        int age = scan.nextInt();
        System.out.println(age + " That's Great!");
        //scan.close(); optional
    }
}
