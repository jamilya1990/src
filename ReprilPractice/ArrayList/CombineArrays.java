package ReprilPractice.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineArrays {
    public static void main(String[] args) {
        String[] r1 = {"a", "b", "c"};
        String[] r2 = {"d", "e", "f", "h"};
        System.out.println(combineRs(r1, r2));
    }
    public static ArrayList<String> combineRs(String[] r1, String[] r2){

        // your code here
        String[] words = new String[r1.length+r2.length];
        int index=0;
        for(int i=0; i<words.length; i++){
            words[i]=r1[index];
        }
        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));


        return list;

    }
}
