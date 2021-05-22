package ReprilPractice;

import java.util.Scanner;

public class LaptopPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = 200.00;
        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();
        System.out.println("Select CPU type:");
        String cpuType = scan.next();
        System.out.println("Select RAM size:");
        int ramSize = scan.nextInt();
        System.out.println("Select storage type:");
        String storageType = scan.next();
        System.out.println("Enter storage size:");
        int storageSize = scan.nextInt();
        System.out.println("Enter screen resolution:");
        String screenResolution = scan.next();
        if (screenSize == 13.3) {
            price = price + 200;
        } else if (screenSize == 15.0) {
            price = price + 300;
        } else if (screenSize == 17.3) {
            price = price + 400;
        }
        if (cpuType.equals("i3")) {
            price = price + 150;
        } else if (cpuType.equals("i5")) {
            price = price + 250;
        } else if (cpuType.equals("i7")) {
            price = price + 350;
        }
        if (ramSize == 4) {
            price = price + 50;
        } else if (ramSize == 8) {
            price = price + 100;
        } else if (ramSize == 12) {
            price = price + 150;
        } else if (ramSize == 16){
            price = price + 200;
        }
        if (storageType.equals("SSD") && storageSize == 500) {
            price = price + 100;
        } else if (storageType.equals("SSD") && storageSize == 1000){
            price = price + 200;
        } else if (storageType.equals("HDD") && storageSize == 500) {
            price = price + 50;
        } else if (storageType.equals("HDD") && storageSize == 1000) {
            price = price + 100;
        }
        if (screenResolution.equals("FULLHD")) {
            price = price + 100;
        } else if (screenResolution.equals("4K")) {
            price = price + 200;
        }
        System.out.println("Laptop price is: $" + price);
    }
}
