package ReprilPractice;

public class MiddleThreeString {
    public static void main(String[] args) {
        String word = "fifteen";
        //YOUR CODE HERE
        if (word.length()>5 && word.length()%2 != 0){
            int length = word.length()/2 - 1;
            String letter = word.substring(length);
            System.out.println(word.substring(word.length()/2-1, word.length()/2+2));
        } else {
            System.out.println("invalid");
        }
    }
}
