package java_programming_classes.day22_string_manipulation;

public class SubstringExample {
    public static void main(String[] args) {
        String word = "java is fun";
        //word.substring(0, word.length());
        System.out.println(word.substring(0, 4));
        System.out.println(word.substring(0,6));
        System.out.println(word.substring(5)); // add only start index and it will print everything after start till the end


    }
}
