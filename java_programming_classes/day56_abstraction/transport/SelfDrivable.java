package java_programming_classes.day56_abstraction.transport;

public interface SelfDrivable {
    void drivingMode();
    //void selfPark();//this will cause error in sub classes, cuz they must override abstract method
    //Since Java 8 they implemented default key to the method. Default prevent from error in sub-classes
    //Everything in abstract is Public!!!!!!!
    public default void selfPark(){
        System.out.println("perform self parking");
    }
}


