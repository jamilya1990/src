package java_programming_classes.day58_polimorphism;

public class SuperMan extends Father implements Worker{


    @Override
    public void work() {
        System.out.println("Work implemented from Interface to Superman class");
    }
}
