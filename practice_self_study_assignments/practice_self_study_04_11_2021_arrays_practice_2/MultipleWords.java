package practice_self_study_assignments.practice_self_study_04_11_2021_arrays_practice_2;

import java.util.Arrays;

public class MultipleWords {
    public static void main(String[] args) {
        String str = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] words = str.split(", ");
        for(String i : words){
            if(i.contains(" ")){
                System.out.println(i);
            }
        }
        //OR! another way:
        for(String j:words){
            if(j.split(" ").length>1){
                System.out.println(j);
            }
        }
    }
}
