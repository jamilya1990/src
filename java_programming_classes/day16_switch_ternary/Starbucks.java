package java_programming_classes.day16_switch_ternary;

public class Starbucks {
    public static void main(String[] args) {
        double price = 0.00;
        int calories = 0;
        String size = "grande";

        if (size.equals("tall")) {
        }
        switch(size) {
            case "tall":
                System.out.println("Tall Cappuccino Please");
                price = 3.69;
                calories = 90;
                break;
            case "grande":
                System.out.println("Grande Cappuccino Please");
                price = 3.99;
                calories = 120;
                break;
            case "venti":
                System.out.println("Venti Cappuccino Please");
                price = 4.29;
                calories = 150;
                break;
            default:
                System.out.println("No such size " + size);
                break; //optional if default is at the end.
        }
               System.out.println("Price: " + price);
               System.out.println("calories = " + calories);

    }
}
