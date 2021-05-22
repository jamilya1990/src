package java_programming_classes.day38_methods;

public class ArrayUtils {
    public static void printArray(int[] nums){
        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static int sum(int[] nums){
        int sum = 0;
        for(int each : nums){
            sum+=each;
        }
        return sum;
    }
    public static boolean containsWord(int[] nums, int num){
        boolean isContain = false;
        for (int i : nums) {
            if(i==num){
                isContain = true;
                break;
            }
        }
        return isContain;

    }
}
