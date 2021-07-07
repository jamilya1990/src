package java_programming_classes.day57_abstraction_polymorphism.polymorphism;

public class Dog extends Animal{

    @Override
    public void makeNoise(){
        System.out.println("Dog is making noise from Dog class, which extended Animal class");
    }
}
