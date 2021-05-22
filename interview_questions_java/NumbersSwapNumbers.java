package interview_questions_java;

public class NumbersSwapNumbers {
    public static void main(String[] args) {
        //Numbers -- Divide without / operator
        //Write a method that can divide two numbers without using division operator
        int var1 = 10;
        int var2 = 5;
        var1 = var1+var2;
        var2 = var1-var2;
        var1 = var1-var2;
        System.out.println(var1);
        System.out.println(var2);

        String word1 = "java";
        String word2 = "level";
        word1 = word1.substring(0)+" "+word2.substring(0);
        word2 = word1.substring(0, word1.indexOf(' '));
        word1 = word1.substring(word1.indexOf(' ')+1);
        System.out.println(word1 + " "+word2);
    }
}
