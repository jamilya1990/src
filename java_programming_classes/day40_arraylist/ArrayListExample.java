package java_programming_classes.day40_arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(10);
        System.out.println("Size = " +nums.size());

        System.out.println("nums.get(0) = " + nums.get(0));
        System.out.println("nums.get(1) = " + nums.get(1));
        System.out.println("nums.get(2) = " + nums.get(2));
        //System.out.println("nums.get(3) = " + nums.get(3));
        System.out.println(nums);

        nums.remove(1);
        System.out.println(nums);

    }
}


