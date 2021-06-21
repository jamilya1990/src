package java_programming_classes.day54_abstraction;

public abstract class MyAbstractClass {
    int num=55;

    public void learn(){
        System.out.println("Learning...");
    }

    public abstract void close();
}

class Sub extends MyAbstractClass{

    public void close(){
        System.out.println("This is the method in sub-class which shows how to use method declared in Abstraction class");
    }
}

class MyObjects {
    public static void main(String[] args) {
        //MyAbstractClass mac = new MyAbstractClass();//Java is not allowing to create object of Abstract class
        Sub sub1 = new Sub();
        sub1.learn();
        sub1.close();
        System.out.println("sub1.num = " + sub1.num);
    }
}
