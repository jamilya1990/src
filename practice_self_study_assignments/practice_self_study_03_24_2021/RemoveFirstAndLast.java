package practice_self_study_assignments.practice_self_study_03_24_2021;

public class RemoveFirstAndLast {
    public static void main(String[] args) {
        String firstWord = "java";
        String secondWord = "selenium";
        System.out.println(firstWord.substring(1));
        System.out.println(secondWord.substring(0, secondWord.length()-1));
    }
}
