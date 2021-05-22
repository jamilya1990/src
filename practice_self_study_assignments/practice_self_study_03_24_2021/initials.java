package practice_self_study_assignments.practice_self_study_03_24_2021;

public class initials {
    public static void main(String[] args) {
        String name = "james bond";
        System.out.println("Initials - " + name.toUpperCase().charAt(0) + name.toUpperCase().charAt(name.indexOf(" ")+1));
    }
}
