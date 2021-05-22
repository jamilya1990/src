package java_programming_classes.day09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price for milk: ");
        double priceForMilk = scan.nextDouble();
        System.out.println("Enter price for bread:");
        double priceForBread = scan.nextDouble();
        System.out.println("Enter price for cucumbers:");
        double priceForCucumbers = scan.nextDouble();
        double totalPrice = priceForMilk + priceForBread + priceForCucumbers;
        System.out.println("Your Total Price is " + totalPrice);
        //System.out.println("Your Total Price is: " + (priceForBread + priceForCucumbers + priceForMilk));

    }
}
