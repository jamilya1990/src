package practice_self_study_assignments.practice_self_study_03_24_2021;

public class Last3LetterOfTheWord {
    public static void main(String[] args) {
        String word2 = "Petsenyuk";
        int length = word2.length();
        //String word2Last3Characters = word2.toLowerCase().substring(word2.charAt(word2.length()-4));
        System.out.println(length);
        char threeLetters = word2.charAt(length - 3);
        System.out.println(threeLetters);
        int indexOfThirdLetter = word2.indexOf(threeLetters);
        System.out.println(indexOfThirdLetter);
        //String last3Letters = word2.substring(indexOfThirdLetter);
        //System.out.println(last3Letters);
        String last3Letters = word2.substring(word2.length()-3);
        System.out.println(last3Letters);

    }
}
