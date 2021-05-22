package practice_self_study_assignments.practice_03_27_2021;

public class WhileLoopSumOfEvenNumbersDivisibleBy3n5 {
    public static void main(String[] args) {
        int number = 0;
        while (number <= 100) {
            if (number % 2 == 0 && number % 3 == 0 && number % 5 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
