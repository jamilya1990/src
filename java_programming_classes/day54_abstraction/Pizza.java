package java_programming_classes.day54_abstraction;

public class Pizza extends MenuItems {

    @Override
    public void prepare() {
        System.out.println("Chop the ingredients and bake pizza");
    }

    @Override
    public void serve() {
        System.out.println("Serve the pizza");
    }
}
