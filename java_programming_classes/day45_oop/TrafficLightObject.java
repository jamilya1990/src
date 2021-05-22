package java_programming_classes.day45_oop;

public class TrafficLightObject {
    public static void main(String[] args) {
        TrafficLight trafficLight1 = new TrafficLight();
        trafficLight1.color = "red";
        //System.out.println(trafficLight.color);

        trafficLight1.showColor();

        trafficLight1.changeColor("green");
        trafficLight1.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("yellow");

        trafficLight2.changeColor("black");
    }
}
