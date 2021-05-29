package java_programming_classes.day47_constructors;

public class Bus {
    Driver driver;
    Engine engine;

    public String toString(){
        return driver.getName() + " | "+engine.getCylinders();
    }
    //static method -> method can be called using the classname. No need for object to be called
    //static variable -> shared variable, only single copy of the variable exist. And can be used without creating object of the class.
    //static block -> block of code, that runs ONCE, before anything else when class is loaded memory.
    //static inner class -> In Java, we can create a class INSIDE another.


}
