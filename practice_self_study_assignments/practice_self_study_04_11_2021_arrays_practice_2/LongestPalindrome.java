package practice_self_study_assignments.practice_self_study_04_11_2021_arrays_practice_2;

public class LongestPalindrome {

    public static void main(String[] args) {
        //Given a String array. Find the longest Palindrome String in your array.Ex: Input: [“java”, “longer word”, “civic” “apple”,  “racecar”, “mom”, “anna”]Output: racecarEx:Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]Output: No palindrome
        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        int count = 0;
        String palindrome = "";
        for (int i = 0; i < words.length; i++) {
            count = 0;
            /*for (int j = 0, k = words[i].length() - 1; k >= 0 && j < words[i].length(); k--, j++) {
                if (words[i].charAt(j) == words[i].charAt(k)) {
                    count++;
                }
            }*/
            //OR another way of finding Palindrome:
            for (int j = 0; j < words[i].length(); j++) {
                if(words[i].charAt(j) == words[i].charAt(words[i].length()-1-j)){
                    count++;
                }
            }
            if (count == words[i].length()) {
                palindrome += words[i] + " ";
            }
        }
        String[] palindromeWords = palindrome.split(" ");
        String longestP = palindromeWords[0];
        String shortestP = palindromeWords[0];
        for (String each : palindromeWords) {
            if (each.length() > longestP.length()) {
                longestP = each;
            }
            if (each.length() < shortestP.length()) {
                shortestP = each;
            }
        }
        System.out.println("Longest Palindrome = " + longestP + "\nShortest Palindrome = " + shortestP);
    }
}
