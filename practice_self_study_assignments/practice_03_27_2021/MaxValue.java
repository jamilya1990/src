package practice_self_study_assignments.practice_03_27_2021;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int max = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter number:");
            num = scan.nextInt();
            if (num > max) {
                max = num;
            }

        }
        System.out.println(max);

    }
}
