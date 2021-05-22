package java_programming_classes.day32_arrays_split;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        double maxPrice = prices[0];
        double minPrice = prices[0];
        String detailsOfMaxPricedItem = "";
        String detailsOfMinPricedItem = "";
        for(int i=0; i<items.length; i++){
            if(maxPrice<prices[i]){
                maxPrice=prices[i];
                detailsOfMaxPricedItem =items[i]+" - $"+maxPrice+" - #"+itemIDs[i];
            }
            if(minPrice>prices[i]){
                minPrice = prices[i];
                detailsOfMinPricedItem = items[i]+" - $"+minPrice+" - #"+itemIDs[i];
            }
        }
        System.out.println("Maximum Priced Item: "+detailsOfMaxPricedItem + "\nMinimum Priced Item: " + detailsOfMinPricedItem);
    }
}
