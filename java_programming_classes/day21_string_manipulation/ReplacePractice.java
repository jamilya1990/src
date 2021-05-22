package java_programming_classes.day21_string_manipulation;


public class ReplacePractice {
    public static void main(String[] args) {

        String word = "github";

        String sentence = "java is fun";
        String withNoSpaces = sentence.replace(" ", "");
        System.out.println(withNoSpaces);
        //System.out.println(sentence.replace("java", "selenium".replace("fun", "a lot of fun")));
        withNoSpaces = sentence.replace("java", "selenium")
                               .replace("fun", "a lot of fun");
        System.out.println(withNoSpaces);

        String result = "1-48 of over 4,000 results for \"java book\"";
        System.out.println(result.replace("1-48 of over ", "")
                                 .replace(" results for \"java book\"", "")
                                 .replace(",", ""));

    }
}
