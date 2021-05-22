package java_programming_classes.day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        String language = "Russian";
        if (language.equals("English")) {
            System.out.println("Hello");
        } else if (language.equals("Spanish")) {
            System.out.println("Hola");
        } else if (language.equals("Russian")) {
            System.out.println("Privet");
        } else {
            System.out.println("Code java");
        }
    }
}
