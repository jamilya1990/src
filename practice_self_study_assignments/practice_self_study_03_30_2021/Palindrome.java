package practice_self_study_assignments.practice_self_study_03_30_2021;

public class Palindrome {
    public static void main(String[] args) {
        String word = "civica";
        char letters = 'a';
        char reverse = 'a';
        for(int i =0; i<word.length(); i++){
            letters = word.charAt(i);
        }
        for(int n=word.length()-1; n>=0; n--){
            reverse = word.charAt(n);
        } if(letters == reverse){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
