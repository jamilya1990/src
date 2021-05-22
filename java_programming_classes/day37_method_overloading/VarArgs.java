package java_programming_classes.day37_method_overloading;

public class VarArgs { //varargs
    public static void addNumbers(int...ints){ //OR (int...nums) doesn't matter
        //inside methos it is used as regular arrays
        int sum = 0;
        for (int n : ints) {
            sum +=n;
        }
        System.out.println("Sum = "+sum);

    }

    public static void main(String[] args) {
        addNumbers(1, 4, 5, 6, 21, 435,943);
        addNumbers();

    }
}
