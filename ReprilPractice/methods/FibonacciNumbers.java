package ReprilPractice.methods;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int[] fibonacci = new int[num];
        for(int i=0; i<fibonacci.length; i++){
            if(i==0){
                fibonacci[i] = 0;
            }else if(i==1){
                fibonacci[i]=1;
            }else if(i>1){
                fibonacci[i] = fibonacci[i-2] +fibonacci[i-1];
            }
        }
        System.out.println(fibonacci[fibonacci.length-1]);




    }
}
