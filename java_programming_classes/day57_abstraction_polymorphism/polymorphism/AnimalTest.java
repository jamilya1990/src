package java_programming_classes.day57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal1 = new Animal();//not polymorphic -> data type and object type are the same
        animal1.makeNoise();

        Animal animal2 = new Horse();//polymorphic -> object type is Animal class and data type is Horse class
        animal2.makeNoise();

        Horse horse = new Horse();//not polymorphic -> data type and object type are the same
        horse.makeNoise();

        Animal animal3 = new Cat();
        animal3.makeNoise();

        Animal animal4 = new Dog();
        animal4.makeNoise();

        /**
         * Polymorphic list of Objects. List data type is Parent class
         * objects are any of child classes
         */

        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Horse());
        listOfAnimals.add(new Cat());
        for (Animal each : listOfAnimals) {
            each.makeNoise();
        }
    }
}
