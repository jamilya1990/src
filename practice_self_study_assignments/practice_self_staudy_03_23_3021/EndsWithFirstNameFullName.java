package practice_self_study_assignments.practice_self_staudy_03_23_3021;

public class EndsWithFirstNameFullName {
    public static void main(String[] args) {
        String fullName = "james smith";
        String lastName = "bond";
        if (fullName.endsWith(lastName)){
            System.out.println("Same last name");
        } else {
            System.out.println("Not the same last name");
        }
    }
}
