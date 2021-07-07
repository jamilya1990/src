package java_programming_classes.day56_abstraction.transport;

public abstract class Transportation {
    public abstract void transportPeople();
    public abstract void cost();

    public void start(){
        System.out.println("Starting the engine");
    }
    public void stop(){
        System.out.println("Shut off the engine");
    }


}
