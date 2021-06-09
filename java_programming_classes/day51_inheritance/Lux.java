package java_programming_classes.day51_inheritance;

public class Lux extends Lyft{
    @Override
    public double calculateRate(double mileage){
        return super.calculateRate(mileage*1.2);
    }
}
