package java_programming_classes.day62_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        List<String> cities = new ArrayList<>(); //polymorphism //cann do new List<>() - cuz List is interface and cannot create objects from Interface
        Collection<String> schools = new ArrayList<>();//polymorphism

        cities.add("MCLean");//add method from Collection or List interface
        cities.add("Vienna");
        cities.add("New York");

        System.out.println(cities);




    }
}
