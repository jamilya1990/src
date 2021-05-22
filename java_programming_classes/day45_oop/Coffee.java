package java_programming_classes.day45_oop;

public class Coffee {
    String type;
    double amount;
    public void refillCoffeeAmount(){
        amount = 100;
        //System.out.println(amount);
    }
    public void drinkCoffeeAmount(double amountDrunk){
        if(amountDrunk<=100 && amountDrunk<=amount){
            amount -= amountDrunk;
           // System.out.println(amount);
        }else{
            System.out.println("ERROR: no such amount of coffee");
        }

    }
    public double getAmount(){
        return amount;
    }
    public void setType(String newType){
        type = newType;
    }
    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }
}
