package interview_questions_java.hackerrank;

public class NegativeSubArray {
    public static void main(String[] args) {
        int[] arr={1,-2, 4, -5, 1};
        int sum = 0;
        int total = 0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum +=arr[j];
                total = sum;
                    if(total<0){
                       count++;
                        System.out.println(total);
                    }

            }
        }
        System.out.println(count);
    }
}
