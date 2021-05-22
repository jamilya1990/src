package practice_self_study_assignments.practice_self_study_03_30_2021;

public class BiggestSubstring {
    public static void main(String[] args) {
        String word = "aaaaaaaaaaaabcdeeeeeeeeeeeeeeeeeee";
        int count = 1;
        int countMax = 1;
        String subWord = "";
        int lastLetter = 0;
        for (int i = 0; i < word.length() - 1; i++) {

            if (word.charAt(i) == word.charAt(i + 1)) {
                count += 1;
                if(count>countMax){
                    countMax=count;
                    lastLetter = (i);//when it comes to here countMax already 2, i reads from index = 0
                }
            } else if (word.charAt(i) != word.charAt(i + 1)) {
                count = 1;
            }
        }
       subWord = word.substring(lastLetter-countMax+2, lastLetter+2);//need to add 2 indexes.
        System.out.println(countMax + " characters in longest substring " + subWord);
    }
}
