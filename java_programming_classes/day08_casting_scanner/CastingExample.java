package java_programming_classes.day08_casting_scanner;

import java.util.Arrays;

public class CastingExample {
    public static void main(String[] args) {
        int num1 = 3456;
        double num2 = num1;
        System.out.println();
        System.out.println("num2 = " + num2);//soutv + Enter for shortcut

        int num10 = 22;
        byte num11 = (byte) num10;
        short num12 = (short) num10;
        System.out.println("num12 = " + num12);
        System.out.println("CastingExample.main");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("num11 = " + num11);
        
        int num13 = 300;
        byte num14 = (byte)num13;
        System.out.println("num14 = " + num14);
        
        int num15 = 98;
        char num16 = (char)num15;
        System.out.println("num16 = " + num16);
        
        char letter = 'A';
        int charLetter = letter;
        System.out.println("charLetter = " + charLetter);
    }
}
