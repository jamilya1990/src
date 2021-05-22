package ReprilPractice.methods;

import java.util.Scanner;

public class MethodIsPalindrome {
   /* public static boolean isPalindrome(String check) {

        String reverse = "";
        check = check.replace(" ", "");
        for(int i=check.length()-1; i<=0; i--){

            reverse += ""+check.charAt(i);
        }
        System.out.println(reverse);
        if(reverse.equals(check)){
            return true;
        }else{
            return false;
        }




    }*/


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println(isPalindrome(in.nextLine()));
        String check = "divis ds";
        String reverse = "";
        check = check.replace(" ", "");
        for(int i=check.length()-1; i>=0; i--){

            reverse += ""+check.charAt(i);
        }
        System.out.println(reverse);
        if(check.equals(reverse)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

}
