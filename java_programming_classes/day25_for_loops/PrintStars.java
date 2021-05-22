package java_programming_classes.day25_for_loops;

public class PrintStars {
    public static void main(String[] args) {

        String myStars = "";
        for(int i = 1; i<=5; i++) {
            //myStars = myStars + "* ";
            myStars += "* ";
        }
        System.out.println("my stars = " + myStars.trim());
    }
}
