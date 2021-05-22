package java_programming_classes.day40_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(); //Polymorphic way of declaring ArrayList
        System.out.println(nums);
        System.out.println("nums.size() = " + nums.size());

        nums.add(2189); nums.add(198); nums.add(9); nums.add(2); nums.add(18);
        nums.add(877); nums.add(29); nums.add(2777); nums.add(65); nums.add(32);
        System.out.println("nums = " + nums);
        
        nums.remove(new Integer(65));
        System.out.println("nums = " + nums);

        //for loop - iterate through all values and prints

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        for(int i : nums){
            System.out.print(i+" ");
        }
    }
}
