package practice_self_study_assignments.practice_05_10_2021_ArrayListPractice2;

import java.util.ArrayList;
//The method will accept a String and a boolean.
// -If the given boolean is true, then extract all the uppercase letters and return them in an ArrayList.
// -If the given boolean is false, then extract all the lowercase letters and return them in an ArrayList
// @param str-Given String
// @param isUpper-Given boolean
// @return -ArrayList of Strings
public class GetUpperOrLowercase {
    public static void main(String[] args) {
        System.out.println("getCase(\"Jamilya Petsenyuk\", true) = " + getCase("Jamilya Petsenyuk", false));

    }
    public static ArrayList<Character> getCase(String s, boolean isTrue){
        ArrayList<Character> list = new ArrayList<>();
        if(isTrue==true){
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)<97){
                    list.add(s.charAt(i));
                }
            }
        }else{
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)>=97){
                    list.add(s.charAt(i));
                }
            }
        }
        return list;
    }
}
