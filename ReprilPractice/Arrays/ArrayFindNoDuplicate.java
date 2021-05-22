package ReprilPractice.Arrays;

public class ArrayFindNoDuplicate {
    public static void main(String[] args) {
        int[] nums = {4, 3,1, 2,2, 3,4};
        int countOfMatches = 0;

        for(int i = 0; i<nums.length; i++){
            countOfMatches = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    countOfMatches++;
                }

            }
            if(countOfMatches==1){
                System.out.println(nums[i]);
            }
        }
    }
}
