package ReprilPractice.OOP.credit_card;
//Discover credit card | card number: 594849844 | balance used: 9585.0 | APR: 11.99 | has cashback: true
//Using Capital One card
//Capital One credit card | card number: 84887112 | balance used: 571.0 | APR: 14.35 | has cashback: false
//Paying 500.0 from 7115.0
//Chase credit card | card number: 5297481 | balance used: 6615.0 | APR: 10.99 | has cashback: true
public class Discover extends CreditCard{
    public Discover(long cardNumber, double balance){
        this.cardNumber=cardNumber;
        this.balance=balance;
        this.apr=11.99;
        this.chashback=true;
    }


    @Override
    public void useCard() {
        System.out.println("Using Discover card");
    }

    @Override
    public void payBalance(double balance) {
        System.out.println("Paying "+balance + " from "+ this.balance);
        this.balance=balance;
    }

    @Override
    public String toString() {
        return "Discover credit card | " +
                "card number: " + cardNumber +
                " | balance used: " + balance +
                " | APR: " + apr +
                " | has chashback: " + chashback;
    }
}
