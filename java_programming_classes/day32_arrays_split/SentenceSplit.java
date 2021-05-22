package java_programming_classes.day32_arrays_split;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("First word = "+words[0]);
        System.out.println("Second word = "+words[1]);
        System.out.println("Third word = "+words[2]);

        String googleResults = "About 1,810,00 results (0.68 seconds)";
        String[] results= googleResults.split(" ");
        System.out.println(Arrays.toString(results));
        System.out.println("Count = " + results[1]);
        System.out.println("seconds = "+results[3].replace("(", ""));
        System.out.println("seconds = "+results[3].substring(1));

        String cats = "bengal cat tabby cat persian cat no cat here";
        System.out.println(cats.split(" cat ").length-1);
    }
}
