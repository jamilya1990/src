package java_programming_classes.day40b_review_class;

public class SumOfNumbers {
    public static void main(String[] args) {
        String nums = "12s35kd100a";
        System.out.println(getSumFromString(nums));
    }
    public static int getSumFromString(String str){
        //[Sum of Numbers from String]
        //
        //Create a method that will accept a String and returns the sum of all the numbers in the String.
        //
        //Requirement: any numbers that are next to each other are not single digit numbers but instead read as a full number
        //	Ex: a5bc12def100g
        //		Here we would have added 5 + 12 + 100
        //		NOT: 5 + 1 + 2 + 1 + 0 + 0

        int sum = 0;
        String num = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                //action:
                num += str.charAt(i) + "";
                if (i==str.length()-1 || !Character.isDigit(str.charAt(i + 1))) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }

        }
        return sum;
    }
}
