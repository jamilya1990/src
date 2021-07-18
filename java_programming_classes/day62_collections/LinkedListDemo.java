package java_programming_classes.day62_collections;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> cities2 = new LinkedList<>();
        cities2.add("Sacramento");
        cities2.add("Miami");
        cities2.add("LA");
        System.out.println(cities2);
        System.out.println("cities2.getFirst() = " + cities2.getFirst());
        System.out.println("cities2.getLast() = " + cities2.getLast());

        //polymorphism
        Collection<Integer> nums2 = new LinkedList<>();
        nums2.add(13);
        nums2.add(52);
        nums2.add(89);
        nums2.add(80);
        nums2.add(80);
        System.out.println("nums2.size() = " + nums2.size());
        System.out.println("nums2 = " + nums2);

        List<String> schools2 = new LinkedList<>();

        schools2.add("FPS");
        schools2.add("TTS");
        schools2.add("JMS");



    }
}
