package java_programming_classes.day57_abstraction_polymorphism.polymorphism;

public class Horse extends Animal{

    @Override
    public void makeNoise(){
        System.out.println("Horse is making noise from Horse class, extended from Animal class");
    }
}
