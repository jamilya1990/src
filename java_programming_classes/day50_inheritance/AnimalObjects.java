package java_programming_classes.day50_inheritance;

public class AnimalObjects {
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.name = "Chumka";
        animal.type = "cow";
        animal.speak();

        Cat cat = new Cat();
        cat.name = "Sofia";
        cat.type = "Cat";
        cat.jump();
        cat.speak();

        Dog dog = new Dog();
        dog.name = "Kubik";
        System.out.println(dog.name);
        dog.type = "Dog";
        System.out.println(dog.type);
        dog.speak();
        dog.run();
    }
}
