package ReprilPractice;

import java.util.Scanner;

public class ShoppingList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;
        for (int i = count; i <= 10; i++) {
            System.out.println("Enter Item" + i + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            System.out.println("Add one more item?");
            countinue = scan.next();
            if (countinue.equalsIgnoreCase("yes")) {
                totalPrice += price;
                shoppingListReport += "Item"+i +": "+item + " Price:" + price;
                shoppingListReport += ", ";
                count++;

            }else {
                totalPrice += price;
                shoppingListReport += "Item"+i +": "+item + " Price:" + price;
                System.out.println(shoppingListReport);
                System.out.println("Total price: " + totalPrice);
                return;
            }

    }System.out.println(shoppingListReport);
        System.out.println("Total price: " + totalPrice);
    }
}
