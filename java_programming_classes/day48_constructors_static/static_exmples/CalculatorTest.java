package java_programming_classes.day48_constructors_static.static_exmples;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator.add(10, 20);
        Calculator mult = new Calculator();
        mult.multiply(15, 20);

        //static method can also be called using the object: BUT you will get the warning.
        mult.add(5, 29);


    }
}
