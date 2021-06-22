package office_hours.Practice_04_06_2021.Practice06_22_2021;

public class Target extends Shopping{
    @Override
    public void buyItem(){
        System.out.println("Buying items at Target");
    }

    @Override
    public void returnItem(){
        System.out.println("Returning items to Target");
    }
}
