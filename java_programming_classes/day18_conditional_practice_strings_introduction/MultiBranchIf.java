package java_programming_classes.day18_conditional_practice_strings_introduction;

public class MultiBranchIf {
    public static void main(String[] args) {
        int number = 0;
        if (number>0) {
            System.out.println(number + " is positive");
        } else if (number<0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println(number + " is zero");
        }
    }
}
