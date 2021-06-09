package java_programming_classes.day51_inheritance;

public class LyftTest {
    public static void main(String[] args) {
        Lux car1 = new Lux();
        System.out.println("car1.calculateRate(6) = " + car1.calculateRate(6));
       // System.out.println(car1.calculateRate(6));

        LyftXL car2 = new LyftXL();
        System.out.println("car2.calculateRate(19) = " + car2.calculateRate(6));

        Lyft car3 = new Lyft();
        System.out.println("car3.calculateRate(6) = " + car3.calculateRate(6));
    }
}
