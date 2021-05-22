package interview_questions_java;

//String -- Same letters
//Write a return method that check if a string is build out of the same letters as another string.
//
//Ex:  same("abc",  "cab"); -> true
//
//same("abc",  "abb"); -> false:
public class StringSameLetters {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ccb";
        int sameLetter = 0;
        boolean isSameLetter = false;
        for (int i = 0; i < str1.length(); i++) {
            sameLetter = 0;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    sameLetter++;
                }
            }
            if (sameLetter == 0) {
                isSameLetter = false;
                break;
           } else if (sameLetter > 0) {
              isSameLetter=true;
            }
        }
        System.out.println(isSameLetter);
    }
}
