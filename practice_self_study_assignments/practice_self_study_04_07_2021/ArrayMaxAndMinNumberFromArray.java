package practice_self_study_assignments.practice_self_study_04_07_2021;

public class ArrayMaxAndMinNumberFromArray {
    public static void main(String[] args) {
        int[] nums = {-3, -11,-78, -890, -7874932, -267};
        int max = nums[0];
        int min = nums[0];
        for (int i:
             nums) {
            if(max<i){
                max = i;
            }
            if(min>i){
                min=i;
            }
        }
        System.out.println("Max Value = "+max);
        System.out.println("Min value = " + min);
    }
}
