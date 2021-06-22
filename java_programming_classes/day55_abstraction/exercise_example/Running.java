package java_programming_classes.day55_abstraction.exercise_example;

public class Running extends Exercise{
    @Override
    public void perform(){
        System.out.println("Performing Running exercise");
    }

    @Override
    public int getCaloriesCount(int minute){
        return 13 * minute;
    }
}
