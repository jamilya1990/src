package java_programming_classes.day61_exceptions_collections;

public class BreakTimeException extends RuntimeException{
    public BreakTimeException() {
    }

    public BreakTimeException(String message) {
        super(message); //call to parent constructor
    }
}
