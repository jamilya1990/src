package practice_self_study_assignments.practice_self_study_04_11_2021_arrays_practice_2;

import java.util.Arrays;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "It started to snow in Chicago";
        //made array from the string:
        String[] strArr = str.split(" ");
        //added new variable to store reversed chars of each array's values separate
        String temp = "";
        //looping through whole array to get each value of array:
        for (int j =0; j< strArr.length; j++) {
            //looping through each array's value to reverse each character:
           for (int k = strArr[j].length()-1; k >=0 ; k--) {
               //after looping through each character of each array's variable in reverse, storing in temp variable
               temp +=strArr[j].charAt(k)+"";
            }
           //re-assigning temp variable (reversed) back to array's initial variable
            strArr[j]=temp;
           //dropping to "" the temp variable, to start fresh in new loop cycle
            temp = "";
        }
        //now we need to make a String from Array with spaces
        str = String.join(" ", strArr);

        System.out.println(str);
    }
}
