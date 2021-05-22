package interview_questions_java;

import java.util.Arrays;

public class StringSortLettersAndNumbers {
    public static void main(String[] args) {
//Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
//Ex:
//Input:  "DC501GCCCA098911"
//OutPut: "CD015ACCCG011899"
        String str = "DC501GCCCA098911";
        String s= "";
        //first looping through str to divide letter substring from digits substring and adding space between them
        for (int i = 0; i<str.length()-1; i++) {
            s += str.charAt(i);
            if (Character.isAlphabetic(str.charAt(i)) && Character.isDigit(str.charAt(i + 1))) {
                s += " ";
            }
            if (Character.isDigit(str.charAt(i)) && Character.isAlphabetic(str.charAt(i + 1))) {
                s += " ";
            }
        }
        //we now have space between substring of digits and substring of letters
        //Splitting String to Array
        String sortedStr = "";
            String[] arr = s.split(" ");
            //looping through each array's value and out of each value creating new Array
            for (String i : arr) {
                char[] chars = i.toCharArray();
                //sorting each new array
                Arrays.sort(chars);
                //looping through each new array of chars to assign it's each value to new String
                for(char j: chars){
                    sortedStr +=""+j;
                }
            }
        System.out.println(sortedStr);
    }
}
