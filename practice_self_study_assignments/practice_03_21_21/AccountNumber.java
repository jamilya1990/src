package practice_self_study_assignments.practice_03_21_21;

public class AccountNumber {
    public static void main (String[] args){
        String accountNumber = "5233445";
        if (accountNumber.startsWith("2")) {
            String message = accountNumber.length()==7 ? "Valid 7 digit account number" : "Invalid 7 digit account number";
            System.out.println(message);
        } else if (accountNumber.startsWith("5")){
            String message = accountNumber.length()==10 ? "Valid 5 digit account number" : "Invalid 5 digit account number";
            System.out.println(message);
        } else {
            System.out.println("Invalid account number" );
        }

    }
}
