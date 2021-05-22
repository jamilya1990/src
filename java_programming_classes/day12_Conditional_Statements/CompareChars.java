package java_programming_classes.day12_Conditional_Statements;

public class CompareChars {
    public static void main(String[] args) {
        char letterOne = 'A';
        char letterTwo = 'B';
        System.out.println("Is first letter bigger than second letter? " + (letterOne>letterTwo));
        System.out.println("IS equal? " + (letterOne==letterTwo) );

        char grade = 'E' + 1;
        char pass = 'B';
        System.out.println("Pass? " + (pass >= grade));
        grade++;
        grade--;
        grade--;
        grade--;
        grade--;
        boolean passed = grade <= 'B';
        System.out.println(passed);
        System.out.println("grade = " + grade);

    }
}
