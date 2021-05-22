package ReprilPractice;

import java.util.Scanner;

public class TrippleStringLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE
        for(int i = 0; i<=str.length()-3; i++){
            char firstLetterOfTriple = str.charAt(i);
            char secondLetterOfTriple = str.charAt(i+1);
            char thirdLetterOfTriple = str.charAt(i+2);
            boolean all3LetterMatch = firstLetterOfTriple == secondLetterOfTriple && secondLetterOfTriple==thirdLetterOfTriple;
            boolean secondLetterInRange = secondLetterOfTriple <= str.charAt(str.length()-2);
            boolean thirdLetterInRange = thirdLetterOfTriple <= str.charAt(str.length()-1);
            if(all3LetterMatch){
                count +=1;
            }

        }System.out.println(count);
    }
}
