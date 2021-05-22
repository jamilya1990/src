package practice_self_study_assignments.practice_Self_Study_03_20_21;
import java.util.Scanner;
public class Unit1_PersonalInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people you live with?");
        int peopleLiveWith = scan.nextInt();
        if (peopleLiveWith <= 2) {
            System.out.println("Lives with 2 or less people");
        } else if (peopleLiveWith <= 6) {
            System.out.println("Lives with 3-6 people");
        } else if (peopleLiveWith > 6) {
            System.out.println("Lives with more than 6 people");
        }
        System.out.println("What city do you live in?");
        scan.nextLine();
        String city = scan.nextLine();
        System.out.println("Do you live in Downtown?");
        boolean isDowntown = scan.nextBoolean();
        if (isDowntown) {
            System.out.println("Have you ever thought about moving to suburbs?");
            boolean movingToSuburbs = scan.nextBoolean();
            if (movingToSuburbs) {
                System.out.println("Do it! It's great!");
            } else {
                System.out.println("You should think about it!");
            }
        }
        System.out.println("Do you have a favorite animal?");
        boolean haveFavoriteAnimal = scan.nextBoolean();
        if (haveFavoriteAnimal) {
            System.out.println("Who is your favorite animal?");
            scan.nextLine();
            String favoriteAnimal = scan.nextLine();
            System.out.println("Wow " + favoriteAnimal + " is a great animal!");
            System.out.println("How many pets do you want?");
            int numberOfPets = scan.nextInt();
            if (numberOfPets > 0) {
                System.out.println("Interesting, do you want " + numberOfPets + " " + favoriteAnimal + "?");
                boolean favoriteAnimalAsAPet = scan.nextBoolean();
            } else {
                System.out.println("That's understandable!");
            }
        }
    }
}