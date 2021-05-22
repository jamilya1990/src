package java_programming_classes.day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(23, 55, 78, 42, 90);
        System.out.println("nums = " + nums);
        //nums.add(100);
        List<Integer> newNums= new ArrayList<>(Arrays.asList(23, 55, 78, 42, 90));
        System.out.println("newNums = " + newNums);

        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke", "pepsi", "mdew", "kambucha"));
        int caffeineAmount= 0;
        for(String drinks:drinksWithCaffeine){
            //if(drinks.equals("monster")||drinks.equals("red bull")){
              //  caffeineAmount = 150;
            //}
            switch (drinks){
                case"monster": case "red bull":
                    caffeineAmount =150;
                    System.out.println(drinks+ "-->"+caffeineAmount);
                    break;
                case"tea": case "coffee":
                    caffeineAmount= 35;
                    System.out.println(drinks + "-->" + caffeineAmount);

            }
        }
        //forEach method (starting from java 8) - lambda function
        //int caffeine = 0;
        drinksWithCaffeine.forEach(each -> {
            int caffeine = 20;
            System.out.println(each);
        });
        List<Integer> arr = Arrays.asList(23, 14, 32, 56, 75);
        arr.forEach(each -> System.out.println(each*2));
    }
}
