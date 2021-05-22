package java_programming_classes.day41_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(28);
        nums.add(56);
        nums.add(1);
        nums.add(3);
        nums.add(13);
        System.out.println("before sorting nums is :"+nums);
        Collections.sort(nums); //sorting in ArrayList
        System.out.println("after sorting: "+nums);

    }
}
