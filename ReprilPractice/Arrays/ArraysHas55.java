package ReprilPractice.Arrays;

public class ArraysHas55 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 5, 5, 1};
        int amountOf5=0;
        for(int i=0; i<=nums.length-1; i++){
            if(nums[i]==5 && nums[i+1]==5){
                amountOf5+=1;
            }
        }
        if(amountOf5 >0){
            System.out.print(true);
        }else{
            System.out.print(false);
        }
    }
}
