package interview_questions_java;

//Write a return  method that can find the unique characters from the String
//
//Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
public class StringFindTheUnique {
    public static String unique(String str){
        String uniqueChars="";
        for (int i = 0; i < str.length();i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if(count==1){
                uniqueChars += str.charAt(i);
            }
        }
        return uniqueChars;
    }

    public static void main(String[] args) {
        String letters = "AAABBBCCCDEF";
       System.out.println(unique(letters));
    }
}
