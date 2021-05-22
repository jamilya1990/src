package ReprilPractice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInnerOuter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter size of Inner:");
        int sizeInner = scan.nextInt();
        //System.out.println("Enter size of Outer:");
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeOuter];
        int[] outer = new int[sizeInner];

        for(int j =0; j < sizeInner; j++) {
           // System.out.println("Enter Outer" + j);
            outer[j] = scan.nextInt();
        }
        for(int i =0; i < sizeOuter; i++) {
           // System.out.println("Enter Inner " + i);
            inner[i] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);

        //WRITE YOUR CODE HERE
      int count = 0;
        for(int i=0; i<outer.length; i++){
            for(int j=0; j<inner.length; j++){
                if(Arrays.binarySearch(outer,inner[i])>=0){
                    count++;
                }else{
                    count--;
                }
            }
        }
        if(count==inner.length){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
