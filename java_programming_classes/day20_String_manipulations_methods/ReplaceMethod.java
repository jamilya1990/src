package java_programming_classes.day20_String_manipulations_methods;

public class ReplaceMethod {
    public static void main(String[] args) {
        String sentence = "java strings are fun";
        System.out.println(sentence);
        System.out.println(sentence.replace("j","J"));
        System.out.println(sentence.replace("fun", "interesting"));
        System.out.println(sentence.replace("java",""));
    }
}
