package java_programming_classes.day07_arithmetic_operators;

public class StringConcatPractice {
    public static void main(String[] args) {
        char char1 = 'a';
        char char2 = 'b';
        System.out.println(char1 + char2); //195 from ASCII table
        System.out.println((char1) + char2); //195 from ASCII table
        System.out.println(char1 + " " + char2); //a b
        System.out.println(char1 + "" + char2); //ab
    }
}
