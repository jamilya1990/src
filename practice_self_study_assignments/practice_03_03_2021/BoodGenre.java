package practice_self_study_assignments.practice_03_03_2021;

public class BoodGenre {
    public static void main(String[] args) {
        String genre = "Fantasy";
        int pageLength = 0;
        double profit = 0.0;
        int sequels = 0;
        int countries = 0;
        switch (genre){
            case "Fantasy":
                pageLength = 500;
                profit = 1_000_000;
                sequels = 5;
                countries = 50;
                break;
            case "Detective":
                pageLength = 350;
                profit = 700_000;
                sequels = 3;
                countries = 45;
                break;
            case "Science Fiction":
                pageLength = 720;
                profit = 900_500;
                sequels = 4;
                countries = 30;
                break;
        }
        System.out.println("Book genre information: Page length - "+pageLength +
                ", profit - " + profit + ", Sequels - " + sequels +
                ", Countries - " + countries);
    }
}
