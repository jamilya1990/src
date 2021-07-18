package office_hours.Practice_04_06_2021.Practice_07_12_2021;

public class PC extends PB implements PI{
//PC is a PB
    @Override
    public void go() {
        System.out.println("PC GO");
    }

    @Override
    public void math(){
        System.out.println("Doing math");
    }
}
