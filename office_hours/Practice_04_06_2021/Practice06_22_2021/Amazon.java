package office_hours.Practice_04_06_2021.Practice06_22_2021;

public class Amazon extends OnlineShopping{

    @Override
    public void payForShipping(boolean shippingPrice) {
        System.out.println("Paying for shipping from Amazon");
    }

    @Override
    public void buyItem() {
        System.out.println("Buying items at Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning items back to Amazon");
    }
}
