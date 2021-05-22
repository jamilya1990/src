package java_programming_classes.day09_scanner_practice;

public class SpeedCheckV1 {
    public static void main (String [] args){
        double speedLimit = 65;
        double currentSpeed = 70;
        double overTheLimit = currentSpeed - speedLimit;
        System.out.println("You are driving " + overTheLimit +" miles per hour over the speed limit!");
    }


}
