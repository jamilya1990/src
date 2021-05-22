package java_programming_classes.day17_ternary_operator_compose;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 98;
        String result = (score > 60) ? "pass" : "fail"; //() are optional here
        System.out.println(result);
        // same but with if statement
        if (score>60) {
            result = "pass";
        } else {
            result = "fail";
        }
        System.out.println("result = " + result);

        String quality = "bad";
        System.out.println(quality.equals("good") ? 100 : 0);
        int x = (quality.equals("good")) ? 100 : 0;
        System.out.println("x = " + x);



        int scoreGrade = 100;
        char grade = (scoreGrade>90) ? 'A' : 'B';
        System.out.println("grade = " + grade);

        int scoreOddEven = 55;
        String evenOdd = (scoreOddEven%2 == 0) ? "even" : "odd";
        System.out.println("evenOdd = " + evenOdd);
    }
}
