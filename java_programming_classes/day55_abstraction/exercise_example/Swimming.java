package java_programming_classes.day55_abstraction.exercise_example;

public class Swimming extends Exercise{
    @Override
    public void perform(){
        System.out.println("Performing Swimming exercise");
    }
    @Override
    public int getCaloriesCount(int minutes){
        return 10 * minutes;
    }


}
