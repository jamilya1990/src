package interview_questions_java;

public class StringSumOfDigitsInString {
    public static void main(String[] args) {
        //Write a method that can return the sum of the digits in a string

        String str = "11234Absj^73";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                sum +=Integer.valueOf(str.charAt(i)+"");
                System.out.println(sum);
            }
        }
        //System.out.println(sum);
       // System.out.println(Integer.valueOf(49+));
    }
}
