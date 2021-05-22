package ReprilPractice.methods;

import java.util.Arrays;

public class MethodsSwitchElements {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(do_switch(arr)));
    }

    public static int[] do_switch(int[] i) {
        int[] arr = new int[i.length];
        for(int j=1; j<i.length-1; j++){
            arr[j]=i[j];
        }
//int firstChar = i[0];
//int lastChar = i[i.length-1];
        arr[0] = i[i.length-1];
        arr[arr.length-1]= i[0];
        return arr;


    }
}
