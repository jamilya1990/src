package java_programming_classes.day37_method_overloading;

public class repeatStrings {
    public static String returnParams(String word, int count, char delimiter){
        String newStr = "";
        for (int i = 0; i < count; i++) {
            newStr +=word + delimiter;
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(returnParams("Student", 5, '*'));
    }
}
