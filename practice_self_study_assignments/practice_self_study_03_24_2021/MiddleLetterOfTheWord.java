package practice_self_study_assignments.practice_self_study_03_24_2021;

public class MiddleLetterOfTheWord {
    public static void main(String[] args) {
        String word = "java";
        if (word.length() % 2 == 0) {
            System.out.println("Middle letters - " + word.charAt(word.length()/2 - 1) + word.charAt(word.length()/2));
            System.out.println("Middle letters version2: " + word.substring(word.length()/2-1, word.length()/2+1));
        } else {
            System.out.println("Middle letter - " + word.charAt(word.length()/2));
        }
    }
}
