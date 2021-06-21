package practice_self_study_assignments.practice_self_study_loop3_04_04_2021;

import java.util.Arrays;

public class CamelCase {
    public static void main(String[] args) {
        String word = "thisHasManyWordsToFind";
        int countOfWords = 1;
        for (int i = 0; i<word.length(); i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                countOfWords +=1;
            }
        }
        System.out.println("Output: " + countOfWords);

        String in = " java is fun ";
        in=in.trim();
        String[] words = in.split(" ");
        System.out.println("words = " + Arrays.toString(words));
        String newWords[] = new String[words.length];
        int i=0;
        for (String each : words) {
            newWords[i]=(each.charAt(0)+"").toUpperCase()+each.substring(1);
            System.out.println("each = " + each);
            i++;
        }
        in=String.join("", newWords);

        System.out.println("in = " + in);

    }
}
