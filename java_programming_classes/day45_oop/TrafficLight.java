package java_programming_classes.day45_oop;

public class TrafficLight {
    String color;
    public void showColor(){
        System.out.println("current color "+ color);
    }
    public void changeColor(String newColor){

        if(newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("green") || newColor.equalsIgnoreCase("yellow")){
            System.out.println("new color = " + newColor);
            color = newColor;

        }else{
            System.out.println("ERROR: Invalid color : "+newColor);
        }


    }
}
