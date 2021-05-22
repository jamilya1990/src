package java_programming_classes.day42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 32, 0, 6, 32, 4));
        List<Integer> uniq = new ArrayList<>();
        for(Integer i:nums){

            if( Collections.frequency(nums, i)==1){
                uniq.add(i);
            }
        }
        System.out.println(uniq);
    }
}
