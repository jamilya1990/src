package java_programming_classes.day55_abstraction.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {
        /**
         * We cannot create object of Exercise class as it is abstract
         */
        //Exercise exercise1 = new Exercise();
        /**
         * We can create object of Exercise but have that object point to any of it's sub-classes - POLYMORPHISM
         */
        Exercise exercise1 = new Running();

        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeights freeWeights = new FreeWeights();

        exercise1.start();
        exercise1.perform();
        System.out.println("Running 30 mins burns - "  + exercise1.getCaloriesCount(30));

        running.start();
        running.perform();
        System.out.println("Running 30 mins burns - "  + running.getCaloriesCount(30));

        swimming.start();
        swimming.perform();
        System.out.println("Swimming 30 mins burns - "  + swimming.getCaloriesCount(30));

        freeWeights.start();
        freeWeights.perform();
        freeWeights.endLift();
        System.out.println("Lifting Free Weights 30 mins burns - "  + freeWeights.getCaloriesCount(30));

    }
}
