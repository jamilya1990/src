package java_programming_classes.day49_static;

public class StaticTest {
    static String word = "java";
    public void add(int num){
        System.out.println("Non static method"+num);
    }
    public static void add(double num){
        System.out.println("Static Method");
    }
    public static void main(String[] args) {
        //static method can be called using class name
        StaticMethods.displayMessage("Wooden Spoon");
        //1. Instance method needs an object to be called
        //StaticMethods.instanceMethod(); //Error
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();
        StaticMethods.anotherStaticMethod();
        add(67.6);//static method can be called directly

        StaticTest test =new StaticTest();
        test.add(78); //not a static method, need to create object first in order to access it's methods or variables

        //2. static method can be only access other static method and variable
        System.out.println(word);
    }
}
