package practice_self_study_assignments.practice_03_27_2021;

import java.util.Scanner;

public class MaxNumberOutOf5WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int max = Integer.max(num, num);
        for (int i = 1; i <= 5; i++) {
            if (num > max) {
                max = num;
            }
            System.out.println("Enter number:");
            num = scan.nextInt();
        }
        System.out.println(max);


    }
}
