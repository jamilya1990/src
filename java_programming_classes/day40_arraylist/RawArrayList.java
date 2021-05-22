package java_programming_classes.day40_arraylist;

import java.util.ArrayList;
import java.util.List;

public class RawArrayList {
    public static void main(String[] args) {

        //ArrayList is a class in Java that is used to store multiple sets of data like array.
        //1) It keeps index ordering
        //2) It allows duplicated values
        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList();//polymorphic way

        //IQ: What is the default capacity of ArrayList? it is 10! - java declares arraylist with 10 null data
        //add values

        list1.add("java");
        list1.add("happy");
        list1.add(1234);
        list1.add(true);
        list1.add(542.213);
        list1.add("Wooden Spoon");
        list1.add('A');
        System.out.println(list1);
        //because it is raw type list it is allowing to add mixed data type: accepts int, double, boolean, String, char in one list

        System.out.println("size = "+list1.size());

        //Raw ArrayList -> is arraylist that can store objects of ANY TYPE. It is not recommended to use like this, unless in certain cases.
        //Instead we need to use Restricted Type - only allows certain type of data.
        ArrayList<Integer> nums = new ArrayList<>(); //Restricted


    }
}