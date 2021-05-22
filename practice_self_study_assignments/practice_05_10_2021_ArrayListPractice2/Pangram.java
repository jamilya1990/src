package practice_self_study_assignments.practice_05_10_2021_ArrayListPractice2;

import java.util.Locale;

//A Pangram is a String that contains all of the letters in the alphabet.
// Create a method that will accept a String and determine if the given String is a pangram.
// If it is a pangram return true,otherwise return false.
// Example Pangrams: -A quick brown fox jumps over the lazy dog.
// -Back in June we delivered oxygen equipment of the same size.
public class Pangram {
    public static boolean isPangram(String s){
        boolean isPangram;
        String pangram = "";
        for (int i = 0; i < s.length(); i++) {
            if(!pangram.toLowerCase(Locale.ROOT).contains(s.charAt(i)+"")){
                if(s.charAt(i)==' '){
                    continue;
                }
                pangram +=s.charAt(i)+"";

            }
        }
        if(pangram.length()==26){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPangram("A quick brown fox jumps over the lazy dog"));
    }
}
