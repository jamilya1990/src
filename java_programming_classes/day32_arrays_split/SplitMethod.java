package java_programming_classes.day32_arrays_split;


import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String words = "java:python:selenium:html";
        String[] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("wordsArray.length = " + wordsArray.length);

        String sentence = "today I am coding java";
        String[] sentenceArray = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));
        System.out.println("first word = "+sentenceArray[0]);
        System.out.println("first word another way = "+sentence.split(" ")[0]);
        System.out.println("Number of words in sentence = "+sentenceArray.length);
        for (String i : sentenceArray) {
            System.out.println(i);
        }
        }
    }

