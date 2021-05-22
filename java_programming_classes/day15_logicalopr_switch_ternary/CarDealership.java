package java_programming_classes.day15_logicalopr_switch_ternary;

public class CarDealership {
    public static void main(String[] args) {
        double budget = 5000;
        String model = "Toyota";
        double carPrice = 5500 ;
        if (carPrice<=budget && (model.equals("Toyota") || model.equals("Honda"))) {
            System.out.println("Yes");
        } else {
            System.out.println("Not");
        }
    }
}
