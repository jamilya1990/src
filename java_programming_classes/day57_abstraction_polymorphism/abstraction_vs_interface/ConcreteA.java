package java_programming_classes.day57_abstraction_polymorphism.abstraction_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB{
    @Override
    public void absMethod() { //concrete sub class must override abstract methods from abstract class or interface
        System.out.println("Overridden absMethod");
    }

    @Override
    public void intMethodA(int num) {//sub class can override non-final methods from parent class
        System.out.println("Overridden intMethodA");
    }

    @Override
    public void intMethodB() {//sub class can override non-final methods from parent class
        System.out.println("Overridden intMethodB");
    }
   // @Override -> static methods are hidden
    public static void staticMethodC(){//static methods ate hidden - not overridden
        System.out.println("staticMethodC hidden version is called");
    }
}
