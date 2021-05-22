package practice_self_study_assignments.practice_03_27_2021;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* without loop what we did to find max value:

        int numOne = scan.nextInt();
        int numTwo = scan.nextInt();
        int numThree = scan.nextInt();

        int max = 0;
        if (numOne>max){
            max = numOne;
        }
        if (numTwo>max){
            max = numTwo;
        }
        if (numThree>max){
            max=numThree;
        }*/
        System.out.println("Enter a number:");
        int enterNumber = scan.nextInt();
        int max = enterNumber;
        int min = enterNumber;
        for(int i = 0; i<4; i++){
            System.out.println("Enter a number:");
            int number = scan.nextInt();
            //max = enterNumber;
            if(number>max){
                max = number;
            }
            if(number<min){
                min = number;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
