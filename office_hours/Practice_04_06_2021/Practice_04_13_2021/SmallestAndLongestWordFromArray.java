package office_hours.Practice_04_06_2021.Practice_04_13_2021;

import java.util.Scanner;

public class SmallestAndLongestWordFromArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many words you want to enter:");
        String[] words = new String[scan.nextInt()];
        scan.nextLine();
        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter your word:" + (i+1));
            words[i] = scan.nextLine();
        }
       /* String max = words[0];
        String min = words[0];
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()>max.length()){
                max = words[i];
            }
            if(words[i].length()<min.length()){
                min = words[i];
            }
        }*/
        //String[] minAndLarge = new String[2]; //new array that will store Min and Max values
        String[] minAndLarge = {words[0], words[1]};
        for(String each : words){
            if(each.length()< words[0].length()){
                minAndLarge[0]=each;
            }
            if(each.length()>words[1].length()){
                minAndLarge[1] = each;
            }
        }
        System.out.println("Smallest element: " +minAndLarge[0] + "\nLargest element: "+minAndLarge[1]);
    }
}
