package practice_self_study_assignments.practice_03_27_2021;

public class WhileLoopSumOfODDNumbersDivisibleBy3n5 {
    public static void main(String[] args) {
        int number = 0;
        //String allOddNumbers = "";
        while (number <= 100) {
            if (number % 2 != 0 && number % 3 == 0 && number % 5 == 0) {
                System.out.println(number);
                //allOddNumbers += " "+number;
            }
            number++;
        }
       // System.out.println("Odd numbers:" + allOddNumbers);
    }
}
