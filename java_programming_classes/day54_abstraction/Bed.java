package java_programming_classes.day54_abstraction;

import java.util.ArrayList;

public class Bed {
    String size;
    ArrayList<Pillow> pillows = new ArrayList<Pillow>();

    public Bed(String size, int numOfPillows){
        this.size = size;
        for (int i = 0; i < numOfPillows; i++) {
            this.pillows.add(new Pillow());
        }
    }
}
class Pillow{
    String material;

    public static void main(String[] args) {
        Bed bed=new Bed("king", 4);
        System.out.println(bed.pillows.size());
    }
}
