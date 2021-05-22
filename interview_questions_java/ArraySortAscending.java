package interview_questions_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySortAscending {
    public static void main(String[] args) {
        //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
        int[] newArr = {2, 1, 5, 34, 0};
        System.out.println(Arrays.toString(sortArrayWithoutSortMethod(newArr)));
    }
    public static int[] sortArrayWithoutSortMethod(int[] arr){
        int[] nums = new int[arr.length];
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }
        int min = arrList.get(0);
        for (int i=0; i< nums.length; i++) {
            for (Integer j : arrList) {
                if (min > j) {
                    min = j;
                }
            }
            nums[i] = min;
            arrList.remove(Integer.valueOf(min));
            if (arrList.size() == 0) {
                break;
            } else {
                min = arrList.get(0);
            }
        }
        //System.out.println(Arrays.toString(nums));
        return nums;

    }
}
