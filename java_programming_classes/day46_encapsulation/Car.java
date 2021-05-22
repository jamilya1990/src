package java_programming_classes.day46_encapsulation;

public class Car {
    private String model;
    private int year;
    private double mileage;
    public void setYear(int year){
        this.year = year;
    }
    public void setMileage(double mileage){
        this.mileage = mileage;
    }

    public void setModel(String model){
        this.model = model;
    }
    public int getYear(){
        return year;
    }
    public double getMileage(){
        return mileage;
    }
    public String getModel(){
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
