package practice_self_study_assignments.practice_self_study_loop3_04_04_2021;

public class ReverseOnlySecondWord {
    public static void main(String[] args) {
        String words = "I love java";
        String subWord = words.substring(words.indexOf(" ")+1, words.lastIndexOf(" "));
        String reversedWord = "";
        for (int i = words.lastIndexOf(" ")-1; i > words.indexOf(" "); i--) {
            reversedWord += words.charAt(i);
        }
        words = words.replace(subWord, reversedWord);
        System.out.println(words);
    }
}
