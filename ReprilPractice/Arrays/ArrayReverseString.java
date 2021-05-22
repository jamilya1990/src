package ReprilPractice.Arrays;

import java.util.Arrays;

public class ArrayReverseString {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int index=nums[nums.length-2];
        for(int i=0; i<=nums.length-1;i++){
            nums[index]=nums[i];
            index--;

            //System.out.println(nums[i]);
        }


        //Do not change below statement:
        System.out.println(Arrays.toString(nums));
    }
}
