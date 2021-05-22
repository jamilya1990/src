package practice_self_study_assignments.practice_03_03_2021;

public class IfStatementTaskStreetLight {
    public static void main(String[] args) {
        String light = "green";
        if (light.equals("green")) {
            System.out.println("Go");
        } else if (light.equals("yellow")) {
            System.out.println("Slow down");
        } else if (light.equals("red")) {
            System.out.println("Stop");
        }
    }
}
