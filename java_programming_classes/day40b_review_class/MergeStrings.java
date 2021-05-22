package java_programming_classes.day40b_review_class;

public class MergeStrings {
    public static void main(String[] args) {
        //User is given two Strings, which could vary in length,
        // merge these Strings so these Strings are combined into one String.
        // Any extra characters from mismatched length String are at the end.
        // Ex:String one = abc
        // String two = defgh
        // Output:adbecfgh
        String one = "abc";
        String two = "def";
        String str = "", max = "", min = "";

        if(one.length()>two.length()){
            max = one;
            min = two;
        }else{
            max = two;
            min = one;
        }

        for (int i = 0; i < min.length(); i++) {
                str += one.charAt(i)+""+two.charAt(i);
        }
        str += max.substring(min.length());

        System.out.println(str);
    }
}
