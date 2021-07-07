package java_programming_classes.day57_abstraction_polymorphism.abstraction_vs_interface;

import java.io.Serializable;

/**
 * Interface can extend other Interfaces, as many as you want!
 * Interface cannot extend Abstract classes, only Interfaces
 * Interface extends and DOES NOT implements
 * Child interface is not responsible to Override parent's methods! -> Concrete sub classes will be responsible
 */
public interface InterfaceB extends InterfaceA, Serializable, Cloneable {
    void intMethodB();
}
