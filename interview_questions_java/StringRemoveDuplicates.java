package interview_questions_java;

public class StringRemoveDuplicates {
    public static void main(String[] args) {
//Write a return method that can remove the duplicated values from String
//Ex:  removeDup("AAABBBCCC")  ==> ABC
    String str = "AAABBBCCC";
        System.out.println(RemoveDuplicates(str));
    }
    public static String RemoveDuplicates(String s){
        String uniqChar = "";
        for (int i = 0; i < s.length(); i++) {
            if(!uniqChar.contains(s.charAt(i)+"")){
                uniqChar += s.charAt(i);
            }
        }
        return uniqChar;
    }
}
