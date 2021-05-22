package practice_self_study_assignments.practice_Self_Study_03_20_21;

import java.util.Scanner;

public class OfficeHoursSchedule {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter week day:");
        String weekDay = scan.next();
        switch (weekDay){
            case "Monday": case "Tuesday": case "Wednesday":
                System.out.println("Office hours at 5:30 - 6:45 EST");
                break;
            case "Thursday":
                System.out.println("Soft Skills day");
                break;
            case "Friday":
                System.out.println("Day off");
                break;
            case "Saturday": case "Sunday":
                System.out.println("Already a long day, no office hours.");
                break;
            default:
                System.out.println("Invalid day given\n");
        }
    }
}
