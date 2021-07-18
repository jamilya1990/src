package java_programming_classes.day61_exceptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int minutes = 40;
        System.out.println("Class is going for " + minutes + " minutes");
        if(minutes>50){
           // throw new BreakTimeException();
            throw new BreakTimeException("It is a break time now!");
        }
        System.out.println("Let's continue the class");


        int balance = 600;
        int itemPrice = 500;

        if(itemPrice>balance){
            throw new InsufficientBalanceException("Transcation declined! Not enough funds!");
        }
            System.out.println("Purchased!");

    }
}
