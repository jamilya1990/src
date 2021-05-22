package interview_questions_java;

import java.util.ArrayList;
//Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
public class ArrayListRemoveSomeValues {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(12);
        nums.add(109);
        nums.add(239);
        ArrayList<Integer> nums2 = new ArrayList<>();
        for(Integer i: nums){
            if(i<=100){
               nums2.add(i);
            }
        }
        nums=nums2;
        System.out.println(nums);
    }
}
