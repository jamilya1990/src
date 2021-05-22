package java_programming_classes.day18_conditional_practice_strings_introduction;

public class FindLargestNumber {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3 = 3;
        if (num1>=num2 && num1 >= num3) {
            System.out.println(num1 + " is largest1");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest2");
        } else {
            System.out.println(num3 + " is the largest3");
        }
    }
}
