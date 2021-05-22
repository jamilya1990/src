package java_programming_classes.day06_arithmetic_operators;

public class MoreCalculationPractice {
    public static void main(String[] args) {
        int toyota = 431;
        int honda = 233;
        int vw = 2;
        int tesla = 20;
        int nissan = 1;
        int bmw = 155;
        //int toyota = 431, honda = 233, vw = 2; can be written in 1 line, but not preferred way.
        int totalCarsInParkingLot = toyota + honda + vw + tesla + nissan + bmw;
        System.out.println(totalCarsInParkingLot);

        String pizza = "Hawaiian";
        int slices = 8;
        int person = 4;
        int slicesPerPerson = slices / person;
        System.out.println("There are " + slicesPerPerson + " slices per person.");
        System.out.println("We ordered " + pizza + " pizza with "
                + slices + " slices, " + person + " people ate " + slicesPerPerson + " slices each" );
    }
}
