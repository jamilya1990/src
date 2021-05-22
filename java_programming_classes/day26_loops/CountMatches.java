package java_programming_classes.day26_loops;

public class CountMatches {
    public static void main(String[] args) {
        String word = "java";
        char letter = 'b';
        int count = 0;
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i)==letter){
                count++;
            }
        }
        System.out.println("There are " + count + " letters in the word " + word);
    }
}
