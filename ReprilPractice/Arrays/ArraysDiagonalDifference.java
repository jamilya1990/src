package ReprilPractice.Arrays;

public class ArraysDiagonalDifference {
    public static void main(String[] args) {
        int[][] matrix = {{11, 7, 4},
                          {1, 5, 7},
                          {10, 1, -12}};
        int result = 0;
        int sum1 = 0;
        int sum2 = 0;
        for(int i =0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(i==j){
                    sum1 +=matrix[i][j];
                }

            }
        }
        for(int i = 0; i< matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(i==j){
                    sum2 +=matrix[i][j];
                }
            }
        }
        result = sum1-sum2;
        // FINAL PRINT
        System.out.println(Math.abs(result));
    }
}
