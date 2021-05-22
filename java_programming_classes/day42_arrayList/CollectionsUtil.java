package java_programming_classes.day42_arrayList;

import java.util.*;

public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("size = "+letters.size());
        System.out.println(letters);
        Collections.reverse(letters);
        System.out.println("reversed letters : " + letters);

        System.out.println("frequency of a: " + Collections.frequency(letters, 'a'));


        System.out.println("Max char = " + Collections.max(letters)); //ascii value of biggest char in ArrayList
        System.out.println("Min char = " + Collections.min(letters));

        Collections.replaceAll(letters,'a','b' );
        System.out.println("after replace : " + letters);

        Collections.reverse(letters);
        System.out.println(Collections.replaceAll(letters, 'i', 'j')); //returns boolean: true-when replaced
        System.out.println(letters);
        Collections.sort(letters);//void method - doesn't return anything. returns boolean

        List<Integer> nums = Arrays.asList(23, 4, 12, 454, 65, 43);

        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("reversed nums = "+nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        Collections.frequency(nums, 4);

        Collections.sort(nums, Collections.reverseOrder()); //sorting in Descending order
        System.out.println(nums);

        Collections.shuffle(nums);
        System.out.println(nums);

    }
}
