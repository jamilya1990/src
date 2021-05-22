package ReprilPractice.Arrays;

import java.util.Arrays;

public class ArrayZombieAttack2 {
    public static void main(String[] args) {
        int[] inhabitants = {10, 5, 0, 0, 4, 7, 6, 2};

        //TODO. Write you code below this line.
        System.out.println("Day 0 " + Arrays.toString(inhabitants));
        int[] emptyArray = new int[inhabitants.length];
        int index=1;
        int[] tempArray = new int[inhabitants.length];
        while(!Arrays.equals(inhabitants, emptyArray)) {
            for(int i=0; i<inhabitants.length; i++){
               if(i==0 && inhabitants[i+1]!=0){
                   tempArray[i]=inhabitants[i];
               }else if(i==0 && inhabitants[i+1]==0){
                   tempArray[i]=inhabitants[i]/2;
               }else if(i==inhabitants.length-1 && inhabitants[i-1]!=0){
                   tempArray[i]=inhabitants[i];
               }else if(i==inhabitants.length-1 && inhabitants[i-1]==0){
                   tempArray[i]=inhabitants[i]/2;
               }else if(inhabitants[i-1]==0 || inhabitants[i+1]==0){
                   tempArray[i]=inhabitants[i]/2;
               }else if(inhabitants[i-1]!=0 && inhabitants[i+1]!=0){
                   tempArray[i]=inhabitants[i];
               }
            }
            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i]=tempArray[i];
            }
            System.out.println("Day " + index+" "+Arrays.toString(inhabitants));
            index++;
            }

        }
    }

