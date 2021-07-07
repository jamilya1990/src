package java_programming_classes.day58_polimorphism;

public class SuperManTest {
    public static void main(String[] args) {
        Father spMan1 = new SuperMan();
        spMan1.feedKids();
        spMan1.playWithKids();
        spMan1.raiseKids();


        SuperMan spMan2 = new SuperMan();
        spMan2.work();
        spMan2.feedKids();
        spMan2.playWithKids();
        spMan2.raiseKids();

        Worker spMan3 =new SuperMan();
        spMan3.work();

        SuperMan spMan4 = new SuperMan();
        
    }
}
