package java_programming_classes.day23_string_manipulations_while_loop;
import java.util.Scanner;
public class TrimMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int firstBread = str.indexOf("bread");
        int lastBread = str.lastIndexOf("bread");
        //String insideSandwich = str.substring(firstBread + 5, lastBread);
        boolean oneBread = str.indexOf("bread") == str.lastIndexOf("bread");
        if(oneBread) {
            System.out.println("nothing");
        }else if (firstBread > -1 && lastBread > -1) {
            System.out.println(str.substring(firstBread + 5, lastBread));
        } else {
            System.out.println("nothing");
        }
    }
}
