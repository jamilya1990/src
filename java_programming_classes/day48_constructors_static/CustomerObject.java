package java_programming_classes.day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomerObject {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1);
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2);
        Customer cs3 = new Customer("John Ward III", 4873);

        System.out.println(cs2);
        System.out.println(cs3);

        //array of Customers
        Customer[] arrCs = new Customer[]{cs1, cs2, cs3, new Customer("Jay", 449)};
        System.out.println(arrCs[0].toString());
        System.out.println("Array of Customers: " + Arrays.toString(arrCs));

        ArrayList<Customer> arrListCS = new ArrayList<>();
        arrListCS.add(cs1);
        arrListCS.add(cs2);
        arrListCS.add(cs3);
        arrListCS.add(new Customer("Tim", 5671));
        System.out.println(arrListCS.get(0));
        System.out.println(arrListCS.get(1).toString());
        System.out.println("Array List of customer: "+arrListCS);

        for (int i = 0; i < arrListCS.size(); i++) {
            System.out.println("Loop " + i + ": " + arrListCS.get(i));
        }
        System.out.println("For each loop:");
        for (Customer each : arrListCS) {
            System.out.println(each);
        }
        //System.out.println();
        for (int i = 0; i < arrListCS.size(); i++) {
            System.out.println(arrListCS.get(i).getName());

        }
        arrListCS.forEach(each -> System.out.println(each.getName()));
    }
}
