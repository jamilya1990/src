package office_hours.Practice_04_06_2021.Practice_07_12_2021;

public class PObject {
    public static void main(String[] args) {

        PA obj1 = new PA();
        obj1.go();

        Object obj2 = new PA();
        ((PA)obj2).go();

        PB obj5 = new PC();
        ((PC)obj5).math();
        ((PI)obj5).math();

        PB obj3 = new PB();
        obj3.go();
        ((PA)obj3).go();
        ((PI)obj3).math();


    }
}
