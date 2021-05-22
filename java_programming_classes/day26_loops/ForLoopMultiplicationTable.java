package java_programming_classes.day26_loops;

public class ForLoopMultiplicationTable {
    public static void main(String[] args) {
        int number = 13;
        if (number <= 0) {
            System.out.println("ERROR: Invalid Input");
            return;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiply " + i + " by " + number + " = " + number * i);
        }

    }
}
