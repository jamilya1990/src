package java_programming_classes.day45_oop;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();

        System.out.println(myCoffee.getAmount());
        myCoffee.refillCoffeeAmount();
        System.out.println("amount after refill = "+myCoffee.getAmount());
        myCoffee.drinkCoffeeAmount(40);
        System.out.println("amount after drinking = "+myCoffee.getAmount());
        myCoffee.drinkCoffeeAmount(70);
        //System.out.println("amount after drinking = " + myCoffee.getAmount());
        System.out.println(myCoffee.toString());

        //add coffee object, set values, call methods
    }
}
