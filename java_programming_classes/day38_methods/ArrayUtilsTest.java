package java_programming_classes.day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] arr = {23, 65, 20, 39};
        ArrayUtils.printArray(arr);
        ArrayUtils.printArray(new int[]{23, 12, 56});
        System.out.println("sum = " + ArrayUtils.sum(new int[]{34, 54, 768}));
        System.out.println("arr sum = " +  ArrayUtils.sum(arr));
        System.out.println("Array Contains Num = " + ArrayUtils.containsWord(arr, 67));
    }
}

