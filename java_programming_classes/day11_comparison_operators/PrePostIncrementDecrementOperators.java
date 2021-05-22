package java_programming_classes.day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        int num1 = 1;
        num1++;
        ++num1;
        System.out.println("num1 = " + num1);
        int num2 = 5;
        --num2;
        num2--;
        System.out.println("num2 = " + num2);

        //Pre-Increment
        int num3 = 4;
        int num4 = ++num3;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        //Post-Increment:
        int num5 = 4;
        int num6 = num5++;
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);

        int myNumber = 10;
        System.out.println(++myNumber); // 11 - adding 1 first/increment first/ then print value
        myNumber = 33;
        System.out.println(myNumber++); //33 - we asked to print myNumber and ++ came later - means it didn't increment
        System.out.println(myNumber); // 34 - we printed variable's value from previous incremented println

        myNumber = 15;
        int yourNumber = ++myNumber;
        System.out.println(myNumber);//16
        System.out.println(yourNumber); //16

        myNumber = 99;
        yourNumber = myNumber++;
        System.out.println(myNumber); //100
        System.out.println(yourNumber); //99

        int a = 5; // increased by 1 in variable c
        int b = 4; //increased by 1 in variable c
        int c = a++ + ++b; // a++ stayed as 5 because ++ is after a. ++b - increased by 1 = 5, cuz ++ is before b
        System.out.println(a);//6
        System.out.println(b);//5
        System.out.println(c);//10





    }

}
