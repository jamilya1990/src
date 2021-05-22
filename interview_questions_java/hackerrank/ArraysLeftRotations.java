package interview_questions_java.hackerrank;

import java.util.Arrays;

public class ArraysLeftRotations {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int d=3;
        int arr[] = new int[a.length];
        int index = 0;
        for(int i=d; i<a.length; i++){
            arr[index] = a[i];
            index++;
        }
        index =d-1;
        for(int i=0; i<d; i++){
            arr[index] = a[i];
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
