package interview_questions_java;

import java.util.Arrays;

public class ArrayFindMaximum {
    public static void main(String[] args) {
        String numbers = "32, 54, 67, 123, 2, 0";
        System.out.println(returnMax(numbers));
    }
    public static int returnMax(String nums){
        //Write a method that can find the maximum number from an int Array
        //String nums = "1, 2, 3, 4, 23, 45, 65, 1";
        String[] newNums = nums.split(", ");
        //System.out.println(Arrays.toString(newNums));
        int[] arr = new int[newNums.length];
        for (int i = 0; i < newNums.length; i++) {
            arr[i] = Integer.valueOf(newNums[i]);
        }
        //System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        System.out.println(max);
        int maxX = Integer.valueOf(newNums[0]);
        System.out.println(maxX);
        for(String i: newNums){
            if(maxX<Integer.valueOf(i)){
                maxX = Integer.valueOf(i);
            }
        }
        //System.out.println(maxX);
        return maxX;
    }
}
