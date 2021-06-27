package java_programming_classes.day56_abstraction.transport;

public class DrivableTest {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.start();
        plane.hi();
        plane.transportPeople();
        plane.cost();
        plane.bye();
        plane.autoPilot();
    }
}
