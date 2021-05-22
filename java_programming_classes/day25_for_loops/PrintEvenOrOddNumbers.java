package java_programming_classes.day25_for_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("EVEN NUMBERS 0-100");
        for (int i = 1; i<=100; i++){
            if (i%2==0){
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println(sum);
        System.out.println("\nODD NUMBERS 0-100");
        for(int i = 1; i <=100; i++){
            if (i%2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
