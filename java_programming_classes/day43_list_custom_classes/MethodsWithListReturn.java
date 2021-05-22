package java_programming_classes.day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        //System.out.println(System.nanoTime());//billion seconds
        long start = System.nanoTime();
        List<Integer> mlnNums = getIntegerList();
        long end = System.nanoTime();
        //System.out.println(mlnNums);
        System.out.println(end-start);

        long start1 = System.nanoTime();
        int[] arr = getIntegerArray();
        long end1 = System.nanoTime();
        System.out.println(end1 - start1);
        //System.out.println(Arrays.toString(arr));
    }
    public static List<Integer> getIntegerList(){
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 1000000 ; i++) {
            nums.add(i);
        }
        return nums;
    }
    public static int[] getIntegerArray(){
        int[] nums = new int[1000001];
        for (int i = 0; i <= 1000000 ; i++) {
            nums[i]=i;
        }
        return nums;
    }
}
