package java_programming_classes.day18_conditional_practice_strings_introduction;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Audi";
        String model = "A3"; //A, S
        double leasingPrice = 0;
        if (make.equals("Mercedes")){
            if(model.equals("A")) {
                leasingPrice = 400;
            } else {
                    leasingPrice = 500;
            }
        } else if (make.equals("Audi")) {
            if (model.equals("SQ5")) {
                leasingPrice = 552;
            } else if (model.equals("A3")) {
                leasingPrice = 412;
            }
        } System.out.println(leasingPrice);
    }
}
