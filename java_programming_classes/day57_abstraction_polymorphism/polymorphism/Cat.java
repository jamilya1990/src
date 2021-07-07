package java_programming_classes.day57_abstraction_polymorphism.polymorphism;

public class Cat extends Animal{

    @Override //putting @Override is not necessary
    public void makeNoise(){
        System.out.println("Cat is making noise from Cat class, extended from Animal class");
    }
}
