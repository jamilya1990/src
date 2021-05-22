package java_programming_classes.day28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnoprstuvwxyz0123456789_~!@#$%^&*()_+";//71 characters in the string
        Random random = new Random();
        //int randomNumber = random.nextInt(21);
        String password = "";

        for(int i = 1; i<=8; i++) {
           // System.out.println(random.nextInt(source.length()));//or instead of (source.length()) we can put 71
            int index = random.nextInt(71);//random num 0-70
            System.out.print(source.charAt(index));
            //source.substring(index. index+1);  - another way with substring

            //to assign to password, so we can print out outside the loop
            password += source.charAt(index);

        }
       // main(null);
        System.out.println("\nPassword - " + password);
    }

}
