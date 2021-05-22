package java_programming_classes.day29_nested_loops_arreys;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int outer = 1; outer<=10; outer++){
            //System.out.println("\nMultiply by "+outer + ":");
            for(int inner = 1; inner<=10; inner++){
                System.out.print(outer * inner + "\t");//add \t to make it more aligned
            }
            System.out.println();//to go to new line after each outer cycle runs
        }
    }
}
