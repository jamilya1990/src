package java_programming_classes.day31_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums, 2344));//will return index of 2344
        System.out.println(Arrays.binarySearch(nums, 24)); //returns -2; as it want to put as second number in the array

        //check if number 12345 is among numbers in array
        if(Arrays.binarySearch(nums, 1245)>=0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
