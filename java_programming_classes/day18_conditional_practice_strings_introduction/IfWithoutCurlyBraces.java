package java_programming_classes.day18_conditional_practice_strings_introduction;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todayClass = "python";

        if (todayClass.equals("java"))
            System.out.println("java is fun"); //when no curly braces then only 1 statement is attachment
        //System.out.println("second statement"); //second statement is not attached to If statement
        else //when 2 statements are added to IF, then else will not work
            System.out.println("it is not java, but "+ todayClass);


        int score = 1;
        if(score ==1) {
            System.out.println("lowest score 1");
        } else if (score ==2) {
            System.out.println("score is 2");
        } else if (score == 3) {
            System.out.println("score is 3");
        } else {
            System.out.println("invalid score");
        }

        int score1 = 1;

        if(score1 ==1)
            System.out.println("TEst lowest score 1"); //only this one is part of IF statement
        System.out.println("Test pass"); // it is not part of IF statement

        }
}
