package java_programming_classes.day31_arrays;
import java.util.Arrays;
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {100, 5, 1, 7, 0, -4, 44, 33};
        //print all nums in same line:
        System.out.println(Arrays.toString(nums));

        //sort nums
        Arrays.sort(nums); //no need to assign to any values. It will sort and you can continue to work
        System.out.println(Arrays.toString(nums));

        //to sort in descending order : Arrays.sort(arrayName, Collections.reverseOrder()); but works ony with objects

        String[] words = {"java", "C#", "C++", "Kotlin", "Python", "Ruby", "Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("["+String.join(", ", words) + "]");
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        //sort words in reverse order
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));
    }
}
