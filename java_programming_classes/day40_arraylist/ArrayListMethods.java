package java_programming_classes.day40_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        List <String> shoppingList = new ArrayList<>();
        System.out.println("shoppingList.size() = " + shoppingList.size());
        System.out.println("shoppingList.isEmpty() = " + shoppingList.isEmpty());
        if(shoppingList.isEmpty()){
            System.out.println("List is empty!");
        }else{
            System.out.println("List is empty");
        }
        shoppingList.add("shoes");
        shoppingList.add("skirt");
        shoppingList.add("bag");
        shoppingList.add("phone");
        shoppingList.add("bike");
        shoppingList.add("java book");
        shoppingList.add("jewelery");
        shoppingList.add("tesla");
        int count = shoppingList.size();
        System.out.println("Items to buy: " + count);

        System.out.println("Is shoes in my list? " + shoppingList.contains("shoes"));

        System.out.println(shoppingList.remove("shoes"));//remove method returns boolean boolean
        System.out.println(shoppingList);
        System.out.println("Done shopping, get back coding");
        shoppingList.clear(); // removes all items
        System.out.println(shoppingList);
    }
}
