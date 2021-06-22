package java_programming_classes.day55_abstraction.interface_demo;

public interface MyInterface {
    public abstract void learn();
}
interface MyInterface2{

}

class MyClass implements MyInterface, MyInterface2{
    @Override
    public void learn(){
        System.out.println("Learning my class");
    }
}
class Main{
    public static void main(String[] args) {
        //MyInterface myInterface = new MyInterface();//Interface cannot be instantiated (same as abstract class).So we cannot create object
        MyClass myClass = new MyClass();
        myClass.learn();

    }
}
