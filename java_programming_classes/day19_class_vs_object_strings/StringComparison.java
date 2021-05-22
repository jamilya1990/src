package java_programming_classes.day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Sacramento";
        //equals() method - case sensitive
        System.out.println(city.equals("java"));//false
        System.out.println(city.equals("Sacramento"));//true
        System.out.println(city.equals("Sacramento ")); //false
        //equalsIgnoreCase() method - case insensitive
        System.out.println(city.equalsIgnoreCase("sacramento"));//true
        System.out.println(city.equalsIgnoreCase("SACRAMENTO"));//true
        System.out.println(city.equalsIgnoreCase("SacRamento"));//true
        System.out.println(city.equalsIgnoreCase("Sacraamento"));//false

        if (city.equals("SacramentO")) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }

        if(city.equalsIgnoreCase("Sacramento")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
