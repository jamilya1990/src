package java_programming_classes.day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "Snowy";
        if (weather.equals("Sunny")) {
            System.out.println("Sunny");
        } else if (weather.equals("Rainy")) {
            System.out.println("Rainy");
        } else if (weather.equals("Windy")) {
            System.out.println("Windy");
        } else if (weather.equals("Snowy")) {
            System.out.println("Snowy");
        } else {
            System.out.println("Weather is good anyway!");
        }
    }
}
