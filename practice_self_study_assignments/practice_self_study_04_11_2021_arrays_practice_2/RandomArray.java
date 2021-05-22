package practice_self_study_assignments.practice_self_study_04_11_2021_arrays_practice_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        //Challenge: Random Array1)Ask the user to enter how many numbers they want in their array2)Ask the user the max number they want for the random numbers –Use this as the bound for your random number3)Create an int array with random numbers. The number of elements is based on the given numberFlow:How many numbers do you want: 5What is the max number value: 50-> Print the array with 5 random numbers from 0 to 50
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want:");
        int size = scan.nextInt();
        System.out.println("What is the max number value");
        int maxNum = scan.nextInt();
        int[] randomArr = new int[size];
        Random random = new Random(maxNum);
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = random.nextInt(maxNum);
        }
        System.out.println("Your random array:");
        System.out.println(Arrays.toString(randomArr));
    }
}
