package java_programming_classes.day43_list_custom_classes;
//we added values to store in this class, so now this class Person became a template:
public class Person {
    //Data > Variables (object variable/instance variables)
    String firstName;
    int age;
    //behavior - Method()
    public void speak(){
        System.out.println("Person is speaking");

    }

}

//in same class we can add another class, but only one can be public
class People {
    public static void main(String[] args) {
        //create object of Person class - Instantiation Person class
        Person person1 = new Person();
        person1.firstName = "Bob";
        person1.age = 33;


        System.out.println(person1.firstName);
        System.out.println(person1.age);
        person1.speak();

        Person person2 = new Person();
        person2.firstName = "Mike";
        person2.age = 40;
        System.out.println(person2.firstName +", "+ person2.age);
        person2.speak();

    }
}
