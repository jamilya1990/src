package ReprilPractice.Arrays;

public class DDBiggestNumberInArray {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 1, 2},
                {3, 4, 5, 6}};
        int biggestNum = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > biggestNum) {
                    biggestNum = arr[i][j];
                }
            }
        }
            System.out.println(biggestNum);
        }
    }
