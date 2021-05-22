package java_programming_classes.day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("intellij"));
        System.out.println(word.endsWith("idea"));

        String firstName = "Dr. Nadir";
        if (firstName.startsWith("Mr")) {
            System.out.println("Man");
        } else if (firstName.startsWith("Dr")) {
            System.out.println("Doctor");
        } else if (firstName.startsWith("Mrs")) {
            System.out.println("Married");
        } else if (firstName.startsWith("Ms")) {
            System.out.println("Single woman");
        } else if (firstName.startsWith("Sr")) {
            System.out.println("Senior");
        }
        String url = "https://www.who.org";
        if (url.endsWith(".com")) {
            System.out.println("Commercial website");
        } else if (url.startsWith(".ru")) {
            System.out.println("Russian website");
        } else if (url.endsWith(".gov")) {
            System.out.println("Government website");
        } else if (url.endsWith(".edu")) {
            System.out.println("Education website");
        } else if (url.endsWith(".org")) {
            System.out.println("Organizational website");
        } else {
            System.out.println("Other Website type");
        }
    }
}
