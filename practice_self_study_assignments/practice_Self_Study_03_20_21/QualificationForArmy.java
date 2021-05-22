package practice_self_study_assignments.practice_Self_Study_03_20_21;
import java.util.Scanner;
public class QualificationForArmy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you a US citizen or a resident?");
        String citizenship = scan.next();
        if (citizenship.equalsIgnoreCase("yes")){
            System.out.println("Enter your age:");
            int age = scan.nextInt();
            if (age >= 18 && age <= 35) {
                System.out.println("Do you have a High school diploma?");
                boolean hasHighSchoolDiploma = scan.nextBoolean();
                if (hasHighSchoolDiploma) {
                    System.out.println("You are qualified for the US Army");
                } else {
                    System.out.println("You must have a high school diploma");
                }
            } else {
                System.out.println("Your age must be between 18 to 35 years old");
            }
        } else {
            System.out.println("You must be a U.S. citizen or a resident");
        }
    }
}
