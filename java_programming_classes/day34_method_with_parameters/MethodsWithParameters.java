package java_programming_classes.day34_method_with_parameters;

public class MethodsWithParameters {
    public static void displayValue(int num){
        System.out.println("The value is " + num);
        //Method with Parameters/Inputs: is when you want your methods to be flexible and more reusable. We can add input/parameter variables.
    }
    public static void main(String[] args) {
        displayValue(6);
        displayValue(90);
        int count = 55;
        displayValue(count);//the value of count will be re-assigned to int num, as if you write num = count
        greetByName("Jamilya");
        String name= "Pupa";
        greetByName(name);
    }
    /**
     * add new method
     */
    public static void greetByName(String name){
        System.out.println("Hello " + name + ", how are you today?");
    }
}
