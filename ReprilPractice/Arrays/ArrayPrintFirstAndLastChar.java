package ReprilPractice.Arrays;

public class ArrayPrintFirstAndLastChar {
    public static void main(String[] args) {
        String[] words = {"java", "house", "dream"};
        for(String each : words){
            each = each.charAt(0) + "" + each.charAt(each.length()-1);
            System.out.println(each);
        }
    }
}
