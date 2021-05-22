package java_programming_classes.day28_loops;
/*
Given a string retrieve and print only unique characters
 */
public class findUniqueChars {
    public static void main(String[] args) {
        String word = "jjaaavva";
        String uniqueCharacter = "";
        for(int i=0; i<word.length(); i++){
            //System.out.println(word.charAt(i));
            //if word.charAt(i) is not contains in unique, then add to unique
            if (!uniqueCharacter.contains(word.charAt(i)+"")){
                uniqueCharacter +=word.charAt(i);
            }
        }
        System.out.println(uniqueCharacter);
    }
}
