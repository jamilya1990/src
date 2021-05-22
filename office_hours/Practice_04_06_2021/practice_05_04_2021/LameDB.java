package office_hours.Practice_04_06_2021.practice_05_04_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class LameDB {
    public static void main(String[] args) {
       String db = "1etsy#2wooden#3spoon";
       String op = "add";
       String id = "1";
       String data = "aaa";
       //String [] arr = db.split("#");
       /* ArrayList<String> arrList = new ArrayList<>(Arrays.asList(db.split("#")));
        System.out.println(arrList);
        int num = Integer.parseInt(id);
        switch (op){
            case "add":
                arrList.add(num-1, id+data);
                break;
            case "edit":
                arrList.set(num-1, id+data);
                break;
            case "delete":
                arrList.remove(num-1);
                break;
        }
        //String listStr =
        //System.out.println(arrList.toString("#"));
        System.out.println(String.join("#",arrList.toArray(new String[arrList.size()])));*/

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(db.split("#")));
        switch (op){
            case "add":
                //arrList.add(Integer.valueOf(id)-1, id+data);
                for(int i=0; i<arrList.size(); i++) {
                    if ((Integer.valueOf(id) - 1) == i && i < arrList.size()) {
                        arrList.set(Integer.valueOf(id) - 1, id + data);
                    }else if(Integer.valueOf(id)-1 == arrList.size()){
                        arrList.add(Integer.valueOf(id) - 1, id + data);
                }else{
                        arrList.set(i, i+1+arrList.get(i).substring(1));
                    }
                }
                break;
            case "edit":
                arrList.set(Integer.valueOf(id)-1, id+data);
                break;
            case "delete":
                arrList.remove(Integer.valueOf(id));
                break;
        }

        System.out.println(String.join("#",arrList.toArray(new String[arrList.size()])));

    }
   // public static String lameDB(String str){

    //}
}
