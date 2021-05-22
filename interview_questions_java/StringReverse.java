package interview_questions_java;

public class StringReverse {
    public static void main(String[] args) {
//Write a return method that can reverse  String
//Ex: Reverse("ABCD"); ==> DCBA
        String str = "ABCDSJK";
        System.out.println(ReverseString(str));
    }
    public static String ReverseString(String s){
        String reverse = "";
        for (int i = s.length()-1; i >=0; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }
}
