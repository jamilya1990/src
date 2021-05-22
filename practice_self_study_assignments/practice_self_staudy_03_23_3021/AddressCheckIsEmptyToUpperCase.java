package practice_self_study_assignments.practice_self_staudy_03_23_3021;

import java.util.Scanner;

public class AddressCheckIsEmptyToUpperCase {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your address:");
        String address = scan.nextLine();
        if (address.isEmpty()) {
            System.out.println("No address found");
        } else {
            System.out.println(address.toUpperCase());
        }
    }
}
