package practice_self_study_assignments.practice_self_study_03_01_2021_approximately;

public class PersonInfo {
    /* Make a class PersonInfo
make a main method

Create variables and give value related to you:

    - String name
    - byte age
    - char gender
    - boolean student
    - short number of siblings
    - long favorite number
    - int number of seasons in your area
    - double birth date: (month.day)
    - int year
    - String full birthday date with year
    - String favorite quote

    - Print the person information

    - Challenge: print your name in a cool way (unicode)
    - Challenge: char star
    U+0414U+0436U+0430U+043CU+0438U+043BU+044F*/
    public static void main(String[] args){
        String name = "\u0414\u0436\u0430\u043C\u0438\u043B\u044F \u041F\u044D\u0446\u044D\u043D\u044E\u043A";
        byte age = 30;
        char gender = 42;
        boolean student = true;
        byte numberOfSiblings = 1;
        long favoriteNumber = 3;
        int numberOfSeasonsInYourArea = 4;
        double birthDate = 05.06;//(month.day)
        int year = 1990;
        String fullBirthdayDate = "05/06/1990"; //with year
        String favoriteQuote = "\"Everything that happens is for the best!\" \u00A9 People";

        System.out.println("Name:\t\t\t\t\t\t\t\t" + name);
        System.out.println("Age:\t\t\t\t\t\t\t\t" + age);
        System.out.println("Gender:\t\t\t\t\t\t\t\t" + gender);
        System.out.println("Currently Student:\t\t\t\t\t" + student);
        System.out.println("Number of siblings:\t\t\t\t\t" + numberOfSiblings);
        System.out.println("Favorite Number:\t\t\t\t\t" + favoriteNumber);
        System.out.println("Number of seasons in your area:\t\t" + numberOfSeasonsInYourArea);
        System.out.println("Birth Date (month and day):\t\t\t" + birthDate);
        System.out.println("Year of birth:\t\t\t\t\t\t" +year);
        System.out.println("Full Birthday Date:\t\t\t\t\t" + fullBirthdayDate);
        System.out.println("Favorite Quote:\t\t\t\t\t\t" + favoriteQuote);
    }
}
