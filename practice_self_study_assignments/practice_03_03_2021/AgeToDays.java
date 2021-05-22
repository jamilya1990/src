package practice_self_study_assignments.practice_03_03_2021;

public class AgeToDays {
    /*Concatination, Arithmetic operators,
================================================

    Make a class AgeToDays
create a main method

    - Declare two int variables: age and age in days

    - Use a base of 365 days in a year

    - Calculate and display:
    You are $age years old! That means you are $days days old
*/
    public static void main (String [] args) {
        int age = 20;
        int ageInDays = age*365;
        System.out.println("You are " + age + " years old! " + "That means you are " + ageInDays + " days old");
    }
}
