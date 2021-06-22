package java_programming_classes.day55_abstraction.flags;

public class FlagDrawing {
    public static void main(String[] args) {

        RussianFlag russianFlag = new RussianFlag();
        russianFlag.draw();

        FrenchFlag frenchFlag = new FrenchFlag();
        frenchFlag.draw();

        UkrainianFlag ukrainianFlag = new UkrainianFlag();
        ukrainianFlag.draw();

    }
}
