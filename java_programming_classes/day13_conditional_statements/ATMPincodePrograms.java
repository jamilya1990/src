package java_programming_classes.day13_conditional_statements;

public class ATMPincodePrograms {
    public static void main(String[] args) {
        System.out.println("****** WELCOME TO TD BANK ATM ******");
        int secretPincode = 2233;
        int inputPincode = 2233;

        if (secretPincode == inputPincode) {
            System.out.println("Welcome to your account!");
            System.out.println("You can withdraw, check your balance, deposit");
        } else {
            System.out.println("Incorrect pincode! " + inputPincode);
            System.out.println("Please try again!");
        }

        System.out.println("Thank you for using TD Bank ATM!");

    }
}
