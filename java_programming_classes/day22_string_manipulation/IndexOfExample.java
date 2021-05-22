package java_programming_classes.day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber, SQL";
        //first comma
        System.out.println(technologies.indexOf(','));
        //last coma
        System.out.println(technologies.lastIndexOf(","));
        if (technologies.contains("maven")) {
            System.out.println("maven is present");
        } else{
            System.out.println("not present");
        }
        if (technologies.indexOf("maven") > -1) {
            System.out.println("maven is found");
        } else {
            System.out.println("maven is not found");
        }
    }
}
