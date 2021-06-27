package java_programming_classes.day56_abstraction.transport;

import java_programming_classes.day56_abstraction.greeting_pack.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void transportPeople() {
        System.out.println("Transport by Plane");
    }

    @Override
    public void cost() {
        System.out.println("Cost = " + 300);
    }

    @Override
    public void hi() {
        System.out.println("Hello from Plane");
    }

    @Override
    public void bye() {
        System.out.println("Bye Bye from Plane");
    }

    @Override
    public void drivingMode() {
        System.out.println("Pilot is driving mode");
    }

    public void autoPilot() {
        System.out.println(true);
    }
}
