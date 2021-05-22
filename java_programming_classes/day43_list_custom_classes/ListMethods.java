package java_programming_classes.day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println("Size = "+getDays().size());
        System.out.println(getDays());
        System.out.println("getDays().get(0) = " + getDays().get(0));
        List<String> dayNames = getDays();
        System.out.println("dayNames = " + dayNames);
        dayNames.removeIf(i->i.length()==6);// removeIf uses lambda function, condition (if day has length of day is equal to 6). Works like for each loop
        //if i.length()==6 is true, then remove i.
        System.out.println(dayNames);

        System.out.println(getRandomList(3));

        System.out.println();
        List<Integer> nums = getRandomList(100);
        nums.removeIf(n -> n<90);
        System.out.println(nums);
    }
    public static List<String> getDays(){
        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        return days;
    }
    public static List<Integer> getRandomList(int size){
        List<Integer> list = new ArrayList<>();
        Random random = new Random(); //new Random object
        for(int i=0; i<size; i++){
            list.add(random.nextInt(101)); //Random object added to the list ArrayList with 0-100 limit
        }
        return list;
    }
}
