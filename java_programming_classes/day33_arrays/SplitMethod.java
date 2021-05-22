package java_programming_classes.day33_arrays;


import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String word ="java";
        String[] wordArray = word.split("a");
        //System.out.println(Arrays.toString(wordArray));
        System.out.println(wordArray.length);
        int countOfA = wordArray.length-1;
        if(word.endsWith("a")){
            countOfA++;
        }
        System.out.println("countOfA = " + countOfA);;

        //DO NOT USE THIS METHOD TO COUNT WORDS!


        //REGULAR EXPRESSION
        String word2 = "java1htln2sql";
        String[] word2Array = word2.split("\\d");
        System.out.println(Arrays.toString(word2Array));
        word2 = word2.replaceAll("\\d", "_");
        System.out.println(word2);

        String password = "Abcd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")){
            System.out.println("password valid");
        }else{
            System.out.println("password invalid");
        }
    }
}
