package java_programming_classes.day57_abstraction_polymorphism.abstraction_vs_interface;

public interface InterfaceA{
    /**
     * Interfaces can only have variable as public static final
     */
    public static final String TYPE = "interface";
    double MAX_COUNT= 500.0; //this is automatically public static final

    /**
     * Interfaces cannot have Constructors!!!
     * Interface think you add method, but not Constructor, And asks to remove body or add static or default
     */
//    public InterfaceA(){
//
//    }


    public abstract void intMethodA(int num); //

    /**
     * starting from java 8(JDK 1.8)
     * interface can have static and default methods
     */
    public static void staticMethodE(String str){
        System.out.println("staticMethodE is called from InterfaceA" + str);
    }

    public default void defaultMethodF(){//default method is a method with a body in interface
        System.out.println("defaultMethodF is called from InterfaceA");
    }

    /**
     * method in Interface cannot be abstract and static at the same time
     */
   // public abstract static void staticAbsIntMethod();
}
