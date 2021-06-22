package java_programming_classes.day55_abstraction.exercise_example;

public abstract class Exercise {

    public void start(){//non-abstract method
        System.out.println("Warming up and starting the exercise");
    }
    /*
    adding bellow abstract method without body/implementation, just signature
    purpose - letting sub classes implement/override their own way
     */
    public abstract void perform();

    /**
     *  another abstract method that concrete sub classes will override/implement
     * @param minutes - how long this exercise is performed
     * @return number of calories burned/used
     * when method is abstract we don't put body/implementation code
     * AND abstract class, method cannot be final
     * AND abstract method cannot be Private
     */
    public abstract int getCaloriesCount(int minutes);



}
