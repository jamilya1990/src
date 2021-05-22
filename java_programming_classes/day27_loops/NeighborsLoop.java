package java_programming_classes.day27_loops;

public class NeighborsLoop {
    public static void main(String[] args) {
        //             0123456789012
        String word = "jaavva spoonn";
        for (int index = 0; index<word.length()-1; index++){
            System.out.print(word.charAt(index));
            System.out.println(word.charAt(index+1));
           // System.out.println(word.charAt(index+2));
            if(word.charAt(index)==word.charAt(index+1)) {
                System.out.println("beep - " + word.charAt(index));
            }
        }

    }
}
