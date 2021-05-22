package interview_questions_java;
//String -- Frequency of Characters
//Write a return method that can find the frequency of characters
//
//Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
public class StringFrequencyOfCharacters {
    public static void main(String[] args) {
        String word = "AAABCCCCDD";
        String uniqueChars = "";
        int frequencyOfChar = 0;
        int maxChar = 0;
        char singleChar = 0;
        for (int i = 0; i < word.length(); i++) {
            if (!uniqueChars.contains(word.charAt(i) + "")) {
                uniqueChars += word.charAt(i);
            }
        }
        for (int j = 0; j < uniqueChars.length(); j++) {
            maxChar = 0;
            frequencyOfChar =0;
            for (int i = 0; i < word.length(); i++) {

                if (uniqueChars.charAt(j) == word.charAt(i)) {
                    frequencyOfChar++;
                    if (maxChar < frequencyOfChar) {
                        maxChar = frequencyOfChar;
                    }
                }

            } singleChar = uniqueChars.charAt(j);
            System.out.print(singleChar+"" + maxChar);
        }
        //System.out.println(uniqueChars +" "+maxChar);
    }
}
