package java_programming_classes.day39_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        int num=100;
        Integer n = new Integer(500);
        System.out.println(n.equals(500));
        System.out.println(n+300);

        Integer intObject = 1000;
        System.out.println(intObject.toString());

        //convert intObject to String:
        String numStr = intObject+"";
        String numStr1 = intObject.toString();
        System.out.println("numStr1 = " + numStr1);

        Byte b1 = new Byte((byte) 5);
        Byte b2 = 10;
        Short sh1 = new Short((short) 40);
        Short sh2 = 50;
        Integer i1 = new Integer(100);
        Integer i2 = 200;
        Long l1 = new Long(300);
        Long l2 = 2923L;
        Float fl1 = new Float(5.1);
        Float fl2 = 1.6F;
        Double d1 = new Double(234.45);
        Double d2 = 432.54;
        Character ch1 = new Character('Q');
        Character ch2 = 'V';
        Boolean bl1 = new Boolean(true);
        Boolean bl2 = false;


    }
}
