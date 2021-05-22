package practice_self_study_assignments.practice_03_03_2021;

public class SwitchTaskNaborhood {
    public static void main(String[] args) {
        String name = "Hills";
        double averagePrice = 0.0;
        double rating = 0.0;
        boolean gated = true;
        boolean allowPets = true;
        switch (name) {
            case "Hills":
                averagePrice = 89_000.0;
                rating = 4.0;
                gated = false;
                allowPets = true;
                break;
            case "Oak":
                averagePrice = 75_000.0;
                rating = 3.5;
                gated = false;
                allowPets = true;
                break;
            case "Highland":
                averagePrice = 150_000.0;
                rating = 4.5;
                gated = true;
                allowPets = false;
                break;
            case "Canyon":
                averagePrice = 201_000.0;
                rating = 4.8;
                gated = true;
                allowPets = true;
                break;
        }
        System.out.println(name + " area information:\nAverage House Price:\t" + averagePrice + "\nRating:\t\t\t\t\t" +
                rating + "\nIs Gated Community:\t\t" + gated + "\nPets Allowed:\t\t\t" +
                allowPets);
    }
}
