package java_programming_classes.day42_arrayList;

import java.util.ArrayList;

public class MethodsWithList {
    public static void main(String[] args) {
        String str = "abcde";
        String word = "ab";
       // String[] arr = new String[str.length()/word.length()];
        ArrayList<String> arr = new ArrayList<>();
        for (int i=0; i<str.length(); i+=word.length()) {
            if(i==(str.length()-word.length()+1)){
                arr.add(str.substring(i));
            }else{
                arr.add(str.substring(i, i+word.length()));
            }
        }
        //ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(str.split(2));
        System.out.println(arr);
        //String[] newArr = new String[];
        if(str.contains(word)){
            String[] newArr = str.split(word);
            str = String.join("["+word+"]", newArr);
            //System.out.println(Arrays.toString(newArr));
        }else{
            str = "["+str+"]";
        }
        System.out.println(str);

    }
}
