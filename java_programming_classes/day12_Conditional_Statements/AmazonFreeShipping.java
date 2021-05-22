package java_programming_classes.day12_Conditional_Statements;
import java.util.Scanner;
public class AmazonFreeShipping {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter your total price");
    double totalPrice = scan.nextDouble();
        if(totalPrice >=25)
    {
        System.out.println("You are eligible for free shipping!");
    }else{
            System.out.println("You are not eligible for free Shipping :(");
        }
        System.out.println("Thank you for shopping at Amazon!");
    }
}
