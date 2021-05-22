package java_programming_classes.day18_conditional_practice_strings_introduction;

public class Authentication {
    public static void main(String[] args) {
        int expLast4SSN = 1234;
        int expPicCode = 4321;

        int last4SSN = 1234;
        int pinCode = 4231;
        if (expLast4SSN == last4SSN && expPicCode == pinCode) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed");
            if (expLast4SSN != last4SSN) {
                System.out.println("SSN is incorrect");
            } else {
                System.out.println("PIN is not correct");
            }
        }
    }
}