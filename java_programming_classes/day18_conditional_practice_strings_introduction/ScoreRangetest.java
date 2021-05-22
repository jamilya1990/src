package java_programming_classes.day18_conditional_practice_strings_introduction;

public class ScoreRangetest {
    public static void main(String[] args) {
        int score=67;
        if (score>=1 && score<40) {
            System.out.println("D");
        }else if (score>=40 && score<60) {
            System.out.println("C");
        } else if ( score>=60 && score< 90) {
            System.out.println("B");
        } else if (score>=90 && score<= 100) {
            System.out.println("A");
        } else {
            System.out.println("Invalid score");
        }
    }
}
