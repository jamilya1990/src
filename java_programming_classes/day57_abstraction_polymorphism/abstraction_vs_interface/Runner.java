package java_programming_classes.day57_abstraction_polymorphism.abstraction_vs_interface;

public class Runner {
    public static void main(String[] args) {
        InterfaceA.staticMethodE("wooden spoon");

        /**
         * You cannot call static method which is stored in Interface in concrete class
         * Only can be called through that interface where static method was stored
         */
        //ConcreteA.staticMethodE("hello");
    }
}
