package java_programming_classes.day44_custom_classes;

public class Animal {
    String type = "Dog";
    public void eat(){
        System.out.println("Eat");
    }
    public void eat(String food){
        System.out.println("Eat " + food );
    }
}

class AnimalObject {
    public static void main(String[] args) {
        Animal pet = new Animal();
        System.out.println(pet.type);
        pet.eat();
        pet.eat("grass");

    }
}