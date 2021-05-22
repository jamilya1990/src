package java_programming_classes.day07_arithmetic_operators;

public class primitiveCasting {
    public static void main (String [] args) {
        int num1 = 100;
        byte b1 = (byte)num1; //convert/cast int value num1 into Byte data type
        short sNum = (byte)num1; // convert/cast int value into Byte, cuz it's smaller than int
        short sNum1 = (short)num1;
        long lNum = num1;


        System.out.println(b1);
        System.out.println(sNum);

    }
}
