package java_programming_classes.day47_constructors;

public class Engine {
    private int cylinders;
    public Engine(){

    }
    public Engine(int cylinders){
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylinders=" + cylinders +
                '}';
    }
}
