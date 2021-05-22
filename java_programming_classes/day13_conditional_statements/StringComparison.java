package java_programming_classes.day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Gatos";
        if (city.equals("Los Angeles")) { //instead of (city == "Los Angeles") and key sensitive
            System.out.println("It is LA");
        } else {
            System.out.println("It is not LA");
        }
        String weather = "sunny";
        if (weather.equals("rainy")) {
            System.out.println("I love rain!");
        } else {
            System.out.println("I love all weathers!");
        }

    }
}
