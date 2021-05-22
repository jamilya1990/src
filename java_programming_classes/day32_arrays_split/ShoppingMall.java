package java_programming_classes.day32_arrays_split;

public class ShoppingMall {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        System.out.println("-------FIND THE FIRST INDEX OF 'Gloves' in items array -----");
        //use for loop with condition
        for(int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves found at index " + i);
                break; //exit for loop
                //System.out.println(i + " - " + items[i]);
            }
        }

        System.out.println("-----Set boolean to true if first 'iPad' is found");
        boolean iPadExists = false;
        for(String item : items) {
            if(item.equalsIgnoreCase("iPad")) {
                iPadExists =  true;
                break;
            }
        }

        System.out.println("iPadExists = " + iPadExists);
        //BREAK TILL 11:16 AM EST
        System.out.println("----------Print Report-----------");
        for (int i=0; i<items.length; i++) {
            System.out.println(i+1 +". "+items[i] + " - "+prices[i]+"$ - "+itemIDs[i]);
        }
        System.out.println("----Look for 'Jaket' and print all info---------");
        for (int i=0; i<items.length; i++) {
        if(items[i].equalsIgnoreCase("Jacket")){
            System.out.println(items[i] + " - $" + prices[i]+" - #"+itemIDs[i]);
            break;//optionally
        }
        }

    }
}

