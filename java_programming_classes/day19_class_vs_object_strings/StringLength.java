package java_programming_classes.day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String password = "Abc12";
        if (password.length() >= 6) {
            System.out.println("password is correct lenth = " + password);
        } else {
            System.out.println("Incorrect length of the password");
        }
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("word.length() = " + word.length());
        System.out.println("wooden spoon".length());
        System.out.println("Nadir");
        String firstName = "Nadir";
        System.out.println(firstName + "-" + firstName.length());
        int count = firstName.length();

        String country = "UsA";
        if (country.equals(country.toUpperCase())) {
            System.out.println("Upper Cases");
        } else {
            System.out.println("Not in all Upper Case");
        }

    }
}
