package java_programming_classes.day57_abstraction_polymorphism.abstraction_vs_interface;

public abstract class AbstractA {
    /**
     * Abstract class can have any access modifier for Variables!!!!
     * But not for methods! Private, static and final are not allowed for abstract methods
     */
    int num1;
    private double price;
    public static int count;
    public final String type = "abstract";
    public static final String LANGUAGE = "java";

    /**
     * Abstract class can have a Constructors
     */
    public AbstractA(){
        System.out.println("Constructor of AbstractA abstract class");
    }

    public abstract void absMethod();
    public void methodB(){
        System.out.println("methodB called");
    }
    public static void staticMethodC(){
        System.out.println("static methodC is called");
    }
    /**
     * abstract methods cannot be private, static or final!!!!!
     * Abstract class can have private, static, final methods, but they cannot be abstract!!!
     */
}
