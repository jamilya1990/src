package ReprilPractice;
import java.util.Scanner;
public class LapropPriceV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = 0.00;
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
            price += 200;
        } else if (screenSize == 15.0) {
            price += 300;
        } else if (screenSize == 17.3) {
            price += 400;
        }
        if (cpuType.equals("i3")) {
            price += 150;
        } else if (cpuType.equals("i5")) {
            price += 250;
        } else if (cpuType.equals("i7")) {
            price += 350;
        }
        if (ramSize == 4) {
            price += 50;
        } else {
            price = price + ramSize / 4 * 50;
        }
        if (storageType.equals("SSD")) {
            if (storageSize == 500) {
                price += 100;
            } else {
                price += storageSize / 500 * 100;
            }
        } else if (storageType.equals("HDD")) {
            if (storageSize == 500) {
                price += 50;
            } else {
                price = price + storageSize / 500 * 50;
            }
        }
        if (screenResolution.equals("FULLHD")) {
            price += 100;
        } else if (screenResolution.equals("4K")) {
            price += 200;
        }
        System.out.println("Laptop price is: $" + price);
    }
    }
