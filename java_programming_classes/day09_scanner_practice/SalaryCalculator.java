package java_programming_classes.day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your hourly rate($):");
        double hourlyRate = scan.nextDouble();
        double weeklyRate = hourlyRate * 40;
        double monthlyRate = weeklyRate * 52 / 12;
        double annualRate = monthlyRate * 12;
        System.out.println("Your Weekly  Rate is " + weeklyRate);
        System.out.println("Your Monthly Rate is " + monthlyRate);
        System.out.println("Your Annual Rate is " + annualRate);

    }
}
