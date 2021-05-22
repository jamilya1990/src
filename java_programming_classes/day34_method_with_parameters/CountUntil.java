package java_programming_classes.day34_method_with_parameters;

import java.sql.SQLOutput;

public class CountUntil {
    public static void count(int num){
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        count(9);
        int num = 6;
        count(num);
        String word = "wooden spoons";
        count(word.length());
        System.out.println();
        printAge(1990);

    }
    public static void printAge(int year){
        System.out.println("Age = " + (2021 - year));
    }
}
