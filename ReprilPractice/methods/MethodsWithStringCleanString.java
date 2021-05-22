package ReprilPractice.methods;

import java.util.Arrays;

public class MethodsWithStringCleanString {
    public static void main(String[] args) {
        String text = "one two three";
        String badWord = "two";
        String[] arr = text.split(" ");

        int count = 0;
        for(int i=0; i<arr.length;i++){
            if(!arr[i].equalsIgnoreCase(badWord)){
                count++;
            }

        }
        int j=0;
        String[] newArr=new String[count];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equalsIgnoreCase(badWord)){
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
