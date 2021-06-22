package java_programming_classes.day55_abstraction.exercise_example;

public abstract class Lifting extends Exercise{
    /**
     * This class is child from abstract class Exercise and also abstract
     * In this class we cannot implement abstract methods from it's Parent class, as it is also abstract
     * We added another abstract method in this child abstract class for example
     * This abstarct method and other abstract methods from parent Exercise class has to be implemented in child
     * first non-abstract child or grandchild class(up to me)
     */
    public abstract void endLift();

}
