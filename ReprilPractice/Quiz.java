package ReprilPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {
    public static void main(String[] args) {
   /* double number = add(3.4);
    number += add("dial");
    number += add(Integer.parseInt("100"));
    number += add(Double.parseDouble("50.8"));
        System.out.println(number);
    }
    public static int add(int n){
        return 5;
    }public static double add(double d) {
        return 2.5;
    }public static long add(String s) {
        return 10; */
        ArrayList<Integer> numsOne = new ArrayList<>();
       numsOne.addAll(Arrays.asList(4, 1, 8, -42, 2, 10));
        ArrayList<Integer> numsTwo = new ArrayList<>();
        for(int each : numsOne){
            switch (each){
                case 1:
                    numsTwo.add(1);
                case 5:
                    numsTwo.add(50);
                    break;
                case 4:
                    break;
                case 8:
                    numsTwo.remove(0);
                    break;
                case 10:
                case -42:
                    numsTwo.add(1,0);
                    break;
                case 55:
                    numsTwo.add(105);
                    break;
                case 2:
                    numsTwo.add(20000);
                    break;
                default:
                    numsTwo.add(null);
            }
            System.out.println(numsTwo);
        }

    }
}
