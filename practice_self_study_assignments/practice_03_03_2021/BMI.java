package practice_self_study_assignments.practice_03_03_2021;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //BMI: Program will ask user to enter their mass (kilogram) and their height (meters). Calculate their BMI and then print the appropriate message based on the provided values: All numbers taken as doubles
        //—> BMI Formula: BMI = mass / height^2
        //—> Values:
        //Less than 18.5 — Underweight
        //From 18.5 to 25 — Normal weight
        //From 25 to 30 — Overweight
        //More than or equal to 30 — Obese
        System.out.println("Enter your weight (kg):");
        double weight = scan.nextDouble();
        System.out.println("Enter your height (m):");
        double height = scan.nextDouble();
        double bmi = weight / (height*height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <25) {
            System.out.println("Normal weight");
        } else if (bmi>=25 && bmi<30) {
            System.out.println("Overweight");
        } else if (bmi >= 30){
            System.out.println("Obese");
        }
    }
}
