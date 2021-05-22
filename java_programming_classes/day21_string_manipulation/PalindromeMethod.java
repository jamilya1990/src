package java_programming_classes.day21_string_manipulation;

public class PalindromeMethod {
    public static void main(String[] args) {
        String newWord = "mom";

        char first = newWord.charAt(0);
        char last = newWord.charAt(2);
        System.out.println(first == last);


        String anotherWord = "dad";
        System.out.println(anotherWord.length());
        String palindrome = anotherWord.charAt(0) == anotherWord.charAt(anotherWord.length()-1)? "Yes":"No";
        System.out.println(palindrome);


    }
}
