package java_programming_classes.day34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        helloWorldCustomMethod();
        helloWorldCustomMethod();
        helloWorldCustomMethod();
    }
    //creating custom method: can be on top after the class name or at the bottom here
    public static void helloWorldCustomMethod(){
        System.out.println("Hello World!");
    }
}
