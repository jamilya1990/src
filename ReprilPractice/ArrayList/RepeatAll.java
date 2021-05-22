package ReprilPractice.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RepeatAll {
        //create your method below
        public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> list1) {
            //ArrayList<Boolean> list2 = new ArrayList<>(list1.size()*2);
            for(int i=0; i<list1.size(); i++){
                list1.add(list1.get(i));
            }
            return list1;
        }


        // Do not touch below

        public static void main (String[]args){

            ArrayList<Boolean> list = new ArrayList<>(Arrays.asList(true, false, false));


            System.out.println(repeatAll(list));
        }
    }
