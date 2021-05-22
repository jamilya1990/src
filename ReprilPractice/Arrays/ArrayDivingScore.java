package ReprilPractice.Arrays;

import java.util.Scanner;

public class ArrayDivingScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];

        //WRITE YOUR CODE HERE
        for(int j = 0; j<score.length; j++){
            System.out.println("Enter score for judge "+j);
            score[j] = input.nextFloat();
        }
        System.out.println("Enter score");
        System.out.println("Enter difficulty:");
        float difficultyLevel = input.nextFloat();
        float totalScore = 0;
        for(int i=1; i<score.length-1; i++){
            totalScore +=score[i];
        }
        float finalScore = totalScore*difficultyLevel*0.6f;
        System.out.println("Total: " + finalScore);
    }
}
