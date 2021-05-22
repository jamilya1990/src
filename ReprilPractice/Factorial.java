package ReprilPractice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number = scan.nextLong();
       // int factorial = 0;
        for(long i = number-1; i>0; i--){
            number = number * i;
        } System.out.println(number);

    }
}
