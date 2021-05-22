package java_programming_classes.day29_nested_loops_arreys;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10;//single variable
        int[] nums = new int[3]; //array variable. Declaring Array
        nums[0] = 5;
        nums[1] = 7;
        //nums[2] = 10.5;

        //we can also use int varible to specify index number
        int i = 0;
        System.out.println(nums[i]);
        i++;
        System.out.println(nums[1]);
//how to find size of array
        System.out.println("number of elements = " + nums.length);
        int len = nums.length;
        System.out.println("len = " + len);

        //change values in the array
        nums[0] = 100;
        nums[1] = 300;
        nums[2] = nums[1];
        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);
        System.out.println("nums[2] = " + nums[2]);
    }
}
