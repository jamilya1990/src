package java_programming_classes.day38_methods;

import static java_programming_classes.day38_methods.StringUtils.isNullOrEmpty;
import static java_programming_classes.day38_methods.StringUtils.*;

public class StringUtilsTest {
    public static void main(String[] args) {
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(""));
        System.out.println("isPalindrome(\"civic\") = " + isPalindrome("civic"));
    }
}
