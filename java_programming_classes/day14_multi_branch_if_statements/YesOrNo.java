package java_programming_classes.day14_multi_branch_if_statements;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("Enter");
        char selection ='y';
        boolean answer;
        if (selection=='y') {
            System.out.println("1");
            answer = true;
        } else {
            System.out.println("3");
            answer = false;
        }
        System.out.println(answer);
    }
}
