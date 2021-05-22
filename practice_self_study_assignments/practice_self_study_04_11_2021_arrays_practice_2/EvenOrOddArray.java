package practice_self_study_assignments.practice_self_study_04_11_2021_arrays_practice_2;

import java.util.Arrays;

public class EvenOrOddArray {
    public static void main(String[] args) {
        //Given an array with values: 1,2,-3,4,-34,55,78,90,33,10-Take our all the even numbers from the array and put them into a new array. Print the new array-Take our all the odd numbers from the array and put them into a new array. Print the new array
        int[] nums = {1,2,-3,4,-34,55,78,90,33,10};
        int indexOfEven = 0;
        int indexOfOdd = 0;
        int countOfEven = 0;
        int countOfOdd = 0;
        //counting how many Odds or Even numbers in Array, so then I can create new Arrays and assign the size = count of even or odd numbers
        for(int i:nums){
            if(i%2==0){
                countOfEven++;
            }else if(i%2!=0){
                countOfOdd++;
            }
        }
        //now I can create new arrays for even and odd numbers with specific size
        int[] evenNums = new int[countOfEven];
        int[] oddNums = new int[countOfOdd];
        for (int i : nums) {
            if(i%2==0){
                evenNums[indexOfEven] =i;
                indexOfEven++;
            }else if(i%2!=0){
                oddNums[indexOfOdd]=i;
                indexOfOdd++;
            }
        }
        System.out.println("Even Numbers: "+Arrays.toString(evenNums)+"\nOdd Numbers: " + Arrays.toString(oddNums));
    }
}
