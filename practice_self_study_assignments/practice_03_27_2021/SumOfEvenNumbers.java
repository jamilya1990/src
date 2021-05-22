package practice_self_study_assignments.practice_03_27_2021;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int number = 0;
        int sumOfEvenNumbers = 0;
        while (number<=100){
            if (number%2 ==0){
                sumOfEvenNumbers += number;
            }
            number ++;
        }
        System.out.println("Sum of even numbers from 1 to 100 = " + sumOfEvenNumbers);
    }
}
