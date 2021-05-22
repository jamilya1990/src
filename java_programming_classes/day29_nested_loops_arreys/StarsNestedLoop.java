package java_programming_classes.day29_nested_loops_arreys;

public class StarsNestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            //System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int outer = 1; outer <= 5; outer++) {
            for (int inner = 1; inner <= outer; inner++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int outer = 1; outer <= 5; outer++) {
            System.out.println();
            for (int inner = 1; inner < outer; inner++) {
                //System.out.print(" ");
                System.out.print("*");
                //}
                //for(int doubleInner = outer; doubleInner>=1; doubleInner--){
                //    System.out.print(" * ");
                //}
                System.out.println();
            }
        }
    }
}
