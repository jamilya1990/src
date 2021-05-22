package java_programming_classes.day18_conditional_practice_strings_introduction;

public class SwitchCheckNumbers {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        switch(num1) {
            case 10:
                num1++;
                num2+=10;
                break;
            case 20:
                num1+=num2; // 30
                num2--; //9
            case 30:
                num1 = 0; //0
                num2 -= 3; // 9 - 3=6
                break;
        }
        System.out.println(num1);
        System.out.println(num2);
    }
}
