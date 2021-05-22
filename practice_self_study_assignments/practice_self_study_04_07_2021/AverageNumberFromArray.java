package practice_self_study_assignments.practice_self_study_04_07_2021;

public class AverageNumberFromArray {
    public static void main(String[] args) {
        int[] nums = {4, 78, 298, 190, 13, -190};
        int sum = 0;
        for (int i:
             nums) {
            sum +=i;
        }
        System.out.println("Average value of the array = "+sum/nums.length);
    }
}
