package practice_self_study_assignments.practice_self_staudy_03_23_3021;

import java.util.Scanner;

public class ReplaceCharacterWhenNumber123 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentences, which contains numbers 1,2 or 3:");
        String text = scan.nextLine();
        if (text.contains("1")) {
                System.out.println(text.replace("a", "e"));
        } else if (text.contains("2")) {
            System.out.println(text.replace("s", "r"));
        } else if (text.contains("3")) {
            System.out.println(text.replace("o","z"));
        } else {
            System.out.println("Text does not contains numbers 1,2 or 3 or letter 'a', 's' or 'o'");
        }
    }
}
