package office_hours.Practice_04_06_2021.Practice06_22_2021;

public class Ebay extends OnlineShopping implements Shipping{

    @Override
    public void payForShipping(boolean shippingPrice) {
        System.out.println("Paying for shipping from Ebay");
    }

    @Override
    public void buyItem() {
        System.out.println("Buying items from Ebay");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning items back to Ebay");

    }
}
