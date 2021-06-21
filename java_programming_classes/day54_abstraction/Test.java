package java_programming_classes.day54_abstraction;

import java.util.Arrays;

public class Test {

    public static int minNum(int[] nums){
        Arrays.sort(nums);
    return nums[0];
}

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 6};
        int min = minNum(arr);
    }
}
