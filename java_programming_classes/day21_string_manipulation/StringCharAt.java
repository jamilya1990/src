package java_programming_classes.day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));

        String company = "Cybertek";
        System.out.println("frist letter: " + company.charAt(0));
        char firstLetter = company.charAt(0);
        System.out.println(firstLetter);
        char letter1 = company.charAt(0);
        char letter2 = company.charAt(1);
        char letter3 = company.charAt(2);
        char letter4 = company.charAt(3);
        char letter5 = company.charAt(4);
        char letter6 = company.charAt(5);
        char letter7 = company.charAt(6);
        char letter8 = company.charAt(7);
        System.out.println(letter1 + " " + letter2 + " " + letter3 +" "+ letter4 + " "+ letter5 + " "+ letter6 + " "+ letter7 + " "+ letter8);

        String withSpaces = letter1 + " " + letter2 + " " + letter3 +" "+ letter4 + " "+ letter5 + " "+ letter6 + " "+ letter7 + " "+ letter8;
        System.out.println("withSpaces = " + withSpaces);

        String newWord = "mom";

        char first = newWord.charAt(0);
        char last = newWord.charAt(2);

        System.out.println(first == last);

    }
}
