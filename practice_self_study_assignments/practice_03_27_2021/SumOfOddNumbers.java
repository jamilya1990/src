package practice_self_study_assignments.practice_03_27_2021;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int number = 0;
        int sumOfOddNumbers = 0;
        while ( number<=100){
            if (number%2 != 0) {
                sumOfOddNumbers += number;
            }
            number ++;
        }
        System.out.println("Sum of odd numbers from 1 to 100 = " + sumOfOddNumbers);
    }
}
