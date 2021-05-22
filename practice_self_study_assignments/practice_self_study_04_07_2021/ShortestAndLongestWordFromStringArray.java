package practice_self_study_assignments.practice_self_study_04_07_2021;

public class ShortestAndLongestWordFromStringArray {
    public static void main(String[] args) {
        String[] arr = {"javascript", "selenium", "SDET", "Automation Engineer"};
        String shortestWord = arr[0];
        String longestWord = arr[0];
        for (String i : arr) {
            if(shortestWord.length()>i.length()){
                shortestWord=i;
            }
            if(longestWord.length()<i.length()){
                longestWord=i;
            }
        }
        System.out.println("Shortest Word - "+shortestWord);
        System.out.println("Longest Word - "+longestWord);
    }
}
