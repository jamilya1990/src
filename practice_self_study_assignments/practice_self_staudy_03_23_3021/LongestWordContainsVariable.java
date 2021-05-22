package practice_self_study_assignments.practice_self_staudy_03_23_3021;

import java.util.Scanner;

public class LongestWordContainsVariable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 words to compare");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();
        System.out.println("Enter character or word to check for:");
        String containsWord = scan.next();
        if (word1.length() >= word2.length() && word1.length() >=word3.length() && word1.contains(containsWord)) {
            System.out.println(word1);
        } else if (word2.length() >= word1.length() && word2.length() >=word3.length() && word2.contains(containsWord)) {
            System.out.println(word2);
        } else if (word3.length() >= word1.length() && word3.length() >=word2.length() && word3.contains(containsWord)) {
            System.out.println(word3);
        } else {
            System.out.println("The longest word does not contain " + containsWord);
        }

    }
}
