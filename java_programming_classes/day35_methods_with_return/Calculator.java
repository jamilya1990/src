package java_programming_classes.day35_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        double num1 = 190;
        double num2 = -12;
        System.out.println("sum = " + add(num1, num2));

        System.out.println("sum another way = " + add(178.32, 983.12));

        //minus method:
        System.out.println(minus(18.34, 23.89));
    }
    public static double add(double num1, double num2){
        return num1 + num2;
    }
    public static double minus(double num1, double num2){
        double result = num1 -num2;
        return result;
    }
    public static double multiply(double num1, double num2){
        return num1*num2;
    }
    public static double divide(double num1, double num2){
        return num1/num2;
    }
}
