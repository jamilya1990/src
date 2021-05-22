package office_hours.Practice_04_06_2021;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "aaabbbccddddeeeeeeeeeee";
        String longestSubstring = "";
        String temp = "";
        for (int i = 0; i < str.length()-1; i++) {
            temp+=str.charAt(i);
            if(str.charAt(i)!=str.charAt(i+1)|| i==str.length()-2){
                if(temp.length()>longestSubstring.length()){
                    longestSubstring=temp;
                }
                temp="";
            }
        }
        System.out.println(longestSubstring);

    }
}
