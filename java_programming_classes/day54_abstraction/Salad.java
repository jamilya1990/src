package java_programming_classes.day54_abstraction;

public class Salad extends MenuItems{
    @Override
    public void prepare() {
        System.out.println("Put all ingredients into the bowl");
    }

    @Override
    public void serve() {
        System.out.println("Serve the salad");
    }
}
