package ReprilPractice.OOP.credit_card;

public abstract class CreditCard {

    long cardNumber;
    double balance;
    double apr;
    boolean chashback;

    public abstract void useCard();
    public abstract void payBalance(double balance);
}
