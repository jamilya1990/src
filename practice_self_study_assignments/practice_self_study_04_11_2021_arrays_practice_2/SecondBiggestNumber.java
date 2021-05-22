package practice_self_study_assignments.practice_self_study_04_11_2021_arrays_practice_2;

public class SecondBiggestNumber {
    public static void main(String[] args) {
//Given an Array of numbers. Find and print the 2ndbiggest number. Note the 2ndbiggest should be unique meaning it should be different from the max numberExample:Input:[4,3,1,4,5,2,4,8,4,8]Output:5
        int[] nums = {4,3,1,4,5,2,4,8,4,8, 10};
        int maxNum = nums[0];
        //looping through array to find max number:
        for(int i:nums){
            if(i>maxNum){
                maxNum=i;
            }
        }
        //max found, now declaring new variable for second Max number
        int secondMax = nums[0];
        //looping through array
        for(int j: nums){
            //nested loop to find if 1 number k is bigger or not by looping through array again
            for(int k:nums){
                if(k>j && k<maxNum){
                    secondMax=k;
                }
            }
        }
        System.out.println(secondMax);
    }
}
