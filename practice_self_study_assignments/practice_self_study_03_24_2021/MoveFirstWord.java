package practice_self_study_assignments.practice_self_study_03_24_2021;

public class MoveFirstWord {
    public static void main(String[] args) {
        String sentence = "Java is fun language";
        String firstWord = sentence.substring(0, sentence.indexOf(" "));
        String restOfTheSentence = sentence.substring(sentence.indexOf(" "));
        System.out.println(restOfTheSentence + " " + firstWord);
    }
}
