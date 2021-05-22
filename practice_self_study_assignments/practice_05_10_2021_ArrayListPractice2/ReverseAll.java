package practice_self_study_assignments.practice_05_10_2021_ArrayListPractice2;
//This method will take an ArrayList of Strings
// and reverse each element
// and return an ArrayList of all reversed words

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAll {
    public static ArrayList<String> getReverse(List<String> lst){
        ArrayList<String> reversed = new ArrayList<>();
        for (String word : lst) {
            String tempWord = "";
            for (int i = word.length()-1; i>=0; i--) {
                tempWord += word.charAt(i)+"";
            }
            reversed.add(tempWord);
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(getReverse(Arrays.asList("ted", "talk", "learn")));
    }
}
