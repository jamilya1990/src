package java_programming_classes.day17_ternary_operator_compose;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        double itemPrice = 30;
        boolean isPrimeMember = false;
        if (isPrimeMember) {
            System.out.println("Eligible for free shipping");
        } else {
            if (itemPrice>=25) {
                System.out.println("Eligible for free regular shipping");
            } else {
                System.out.println("Not eligible for free shipping");
            }
        }
    }
}
