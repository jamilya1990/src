package java_programming_classes.day47_constructors;

public class Bus {
    Driver driver;
    Engine engine;

    public String toString(){
        return driver.getName() + " | "+engine.getCylinders();
    }


}
