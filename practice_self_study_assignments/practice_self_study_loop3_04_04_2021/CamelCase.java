package practice_self_study_assignments.practice_self_study_loop3_04_04_2021;

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
    }
}
