package practice_self_study_assignments.practice_Self_Study_03_20_21;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate:");
        double hourlyRate = scan.nextDouble();
        if (hourlyRate >0) {
            System.out.println("Enter weekly hours:");
            int weeklyHours = scan.nextInt();
            if (weeklyHours >= 1 && weeklyHours <= 65) {
                System.out.println("Enter number of weeks:");
                int numberOfWeeks = scan.nextInt();
                if (numberOfWeeks > 1 && numberOfWeeks <= 52) {
                    System.out.println("Salary = " + (hourlyRate*numberOfWeeks*weeklyHours));
                } else {
                    System.out.println("Number of weeks cannot be less than 1 or greater than 52");
                }
            } else {
                System.out.println("Weekly Hours cannot be less than 1 or greater than 65\n");
            }
        } else {
            System.out.println("Hourly Rate cannot be Negative or Zero");
        }
    }
}
