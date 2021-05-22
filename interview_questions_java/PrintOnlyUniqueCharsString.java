package interview_questions_java;

public class PrintOnlyUniqueCharsString {
    public static void main(String[] args) {
        String str = "AADEF";
        String uniqueChars="";
        //int count = 0;
        for (int i = 0; i < str.length();i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
            if(count==1) {
                uniqueChars += str.charAt(i);

            }
        }
        System.out.println(uniqueChars);
    }
}
