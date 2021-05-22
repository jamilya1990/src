package interview_questions_java;

public class StringPasswordValidationTask {
    public static void main(String[] args) {
        //Write a return method that can verify if a password is valid or not.
        //requirements:
        // 1. Password MUST be at least have 6 characters and should not contain space
        //2. PassWord should at least contain one upper case letter
        //3. PassWord should at least contain one lowercase letter
        //4. Password should at least contain one special characters
        //5. Password should at least contain a digit
        //if all requirements above are met, the method returns true, otherwise returns  false
        String pwd = "Ab$123";
        checlPassword(pwd);
        System.out.println(checlPassword(pwd));
    }
    public static Boolean checlPassword (String password) {

        boolean isValid = false;
        int upperCase = 0;
        int lowerCase = 0;
        int specialChar = 0;
        int digit = 0;
        if (password.length() < 6) {
            isValid = false;
        } else if (password.contains(" ")) {
            isValid = false;
        } else {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    upperCase++;
                } else if (Character.isLowerCase(password.charAt(i))) {
                    lowerCase++;
                } else if (!Character.isAlphabetic(password.charAt(i)) && !Character.isDigit(password.charAt(i))) {
                    specialChar++;
                } else if (Character.isDigit(password.charAt(i))) {
                    digit++;
                }
            }
            if (upperCase == 0 || lowerCase == 0 || specialChar == 0 || digit == 0) {
                isValid = false;
            } else {
                isValid = true;
            }
        }
        return isValid;
    }
}
