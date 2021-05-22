package java_programming_classes.day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(123 == 123);
        System.out.println(10>5);
        System.out.println(10<20);
        System.out.println(10>=10);
        System.out.println(10<=20);
        System.out.println(10!=20);

        boolean result;
        result = 5==5;
        System.out.println("result = " + result);
        result = 33>44;
        System.out.println("result = " + result);

        String city = "Seattle";
        System.out.println(city == "Seattle"); // true
        System.out.println(city == "Baku"); // false
        System.out.println(city != "LA"); //true
        
        String name = "Jamilya";
        boolean checkName = name == "Jamilya";
        System.out.println("checkName = " + checkName); // true
        checkName = name != "Kuzat";
        System.out.println("checkName = " + checkName); // true

    }
}
