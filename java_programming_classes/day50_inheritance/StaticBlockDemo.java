package java_programming_classes.day50_inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticBlockDemo {
    static int num;
    static List<String> carModels;
    static {
        System.out.println("Static initializer block");
        num=10;
        carModels= new ArrayList<>();
        carModels.addAll(Arrays.asList("Honda", "Acura", "Civic"));
    }
    {//initializer block  - runs everytime object us created, before constructor
        System.out.println("Initializer block");
    }

    public StaticBlockDemo(){
        System.out.println("Constructor here:");
        num+=5;
    }
    public StaticBlockDemo(int value){
        System.out.println("Overloaded value of constructor - " + value);
        num+=value;
    }
}