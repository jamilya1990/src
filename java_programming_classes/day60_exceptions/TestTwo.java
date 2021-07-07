package java_programming_classes.day60_exceptions;

import java_programming_classes.day58_polimorphism.Worker;

public interface TestTwo implements Test extends Worker {
    public static void eat(){
        System.out.println("test");
    }
    static void meth(){

    }

}
