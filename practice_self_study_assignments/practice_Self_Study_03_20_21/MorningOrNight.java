package practice_self_study_assignments.practice_Self_Study_03_20_21;

import java.util.Scanner;

public class MorningOrNight {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hours:");
        int hours = scan.nextInt();
        if (hours>=0 && hours <= 24) {
            String morningOrNight = (hours>=0 && hours<=11)? "Morning":"Night";
            System.out.println(morningOrNight);
        }else {
            System.out.println("Invalid hours entered");
        }
    }
}
