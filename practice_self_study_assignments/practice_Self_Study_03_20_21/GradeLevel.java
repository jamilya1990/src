package practice_self_study_assignments.practice_Self_Study_03_20_21;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter grade level:");
        byte gradeLevel = scan.nextByte();
        String schoolLevel;
        switch (gradeLevel) {
            case 1: case 2: case 3: case 4: case 5:
                schoolLevel = "Elementary school";
                break;
            case 6: case 7: case 8:
                schoolLevel = "Middle School";
                break;
            case 9: case 10: case 11: case 12:
                schoolLevel = "High school";
                break;
            case 13: case 14: case 15: case 16:
                schoolLevel = "College";
                break;
            case 17: case 18:
                schoolLevel = "Grad school";
                break;
            default:
                schoolLevel = "Invalid grade level given";
        } System.out.println(schoolLevel);
    }
}
