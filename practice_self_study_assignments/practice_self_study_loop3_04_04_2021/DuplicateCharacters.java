package practice_self_study_assignments.practice_self_study_loop3_04_04_2021;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String word = "AAABCACDEEF";
        String uniqueLetter = "";
        for (int i = 0; i < word.length(); i++) {
            if(word.substring(i+1).contains(word.charAt(i)+"") ) {
                if(!uniqueLetter.contains(word.charAt(i)+"")){
                    uniqueLetter += word.charAt(i);
                    System.out.print(word.charAt(i));
                }
            }
        }

    }
}
