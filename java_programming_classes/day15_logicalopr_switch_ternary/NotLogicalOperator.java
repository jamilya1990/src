package java_programming_classes.day15_logicalopr_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        boolean isAffordable = false;
        if (!isAffordable) {
            System.out.println("Not Affordable");
        } else {
            System.out.println("Affordable");
        }

        String env = "Dev";
        if (!(env == "qa")) {
            System.out.println("Wrong env");
        }
        String secretPassword = "abc123";
        String inputPassword = "abc13";
        if (!inputPassword.equals(secretPassword)){
            System.out.println("incorrect Password");
        }
        if (inputPassword.equals("abc123")) {
            System.out.println("Correct Password");
        } else {
            System.out.println("Incorrect Password");
        }
    }
}
