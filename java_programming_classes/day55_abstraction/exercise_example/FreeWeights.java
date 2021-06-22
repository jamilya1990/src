package java_programming_classes.day55_abstraction.exercise_example;

public class FreeWeights extends Lifting{
    /**
     * This class is first Non-Abstract class in this structure.
     * It is responsible to implement all abstract methods from Parent and Grandparent classes
     */
    @Override
    public void perform(){
        System.out.println("Performing Lifting of Free Weights");
    }

    @Override
    public int getCaloriesCount(int minutes){
        return 6 * minutes;
    }

    @Override
    public void endLift(){
        System.out.println("End Lifting Free Weights exercise");
    }
}
