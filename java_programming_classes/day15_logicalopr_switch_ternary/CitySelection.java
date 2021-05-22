package java_programming_classes.day15_logicalopr_switch_ternary;

public class CitySelection {
    public static void main(String[] args) {

        String city = "Miami";
        String cityTwo = "Santa Barbara";
        if (city.equals("Miami") || city.equals("Santa Barbara")) {
            System.out.println("I am willing to relocate");
        } else {
            System.out.println("No Thanks");
        }

        String teacher = "Akbar";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It is a java class");
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill class with Nadir");
        } else {
            System.out.println("Some class with " + teacher);
        }

        String company = "Tesla";
        double salary = 100000.0;
        if (company.equals("Tesla") || salary >= 150000.0) {
            System.out.println("accept");
        } else {
            System.out.println("not accept");
        }
    }
}
