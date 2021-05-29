package java_programming_classes.day47_constructors;

public class BusObject {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        bus1.driver = new Driver("Abbas");
        bus1.engine = new Engine(10);
        System.out.println(bus1.toString());

        Bus bus2 = new Bus();
        bus2.driver = new Driver("Aziz");
        bus2.engine = new Engine(15);

        System.out.println(bus2);
    }
}
