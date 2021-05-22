package practice_self_study_assignments.practice_03_21_21;

public class CoolName {
    public static void main(String[] args) {
        String name = "Amilyam";
        if (name.startsWith("A") || name.startsWith("Z")) {
            System.out.println("Your name is cool");
        } else if (name.endsWith("m")) {
            System.out.println("Almost cool");
        } else {
            System.out.println("Sorry, not a cool name");
        }
    }
}
