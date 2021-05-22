package java_programming_classes.day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'b';
        int index = -1;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i)==letter){
                index = i;
            }
        } System.out.println(index);

    }
}
