package practice_self_study_assignments.practice_03_27_2021;

import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        int min = 0;
        for(int i = 5; i>=1; i--){
            System.out.println("Enter a number:");
            number = scan.nextInt();
           //min = number;
            if(min<number){
                min = number;
            }min = number;
        }System.out.println("Minimum number is " + min);
    }
}
