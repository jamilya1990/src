package java_programming_classes.day17_ternary_operator_compose;

public class VendingMachine {
    public static void main(String[] args) {
        String selection = "snack";
        String drink = "coke";
        String snack = "cookies";
        if (selection.equals("drink")){
            System.out.println("Drink is selected");
            if(drink.equals("tea")) {
                System.out.println("Tea is selected");
            } else{
                System.out.println("Coke is selected");
            }
        } else {
            System.out.println("Snack is selected");
            if(snack.equals("chips")){
                System.out.println("Chips are selected");
            } else {
                System.out.println("Cookies are selected");
            }
        }
    }
}
