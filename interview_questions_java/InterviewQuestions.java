package interview_questions_java;

public class InterviewQuestions {
    public static void main(String[] args) {
        //Numbers -- Divide without / operator
        //Write a method that can divide two numbers without using division operator
        int num1 = 10;
        int num2 = 2;
        int count = 0;
        for (int i = num1; i >=num2 ; i-=num2) {
           if(num1-num2>=0){
               count+=1;
           }

        }
        System.out.println(count);
    }
}
