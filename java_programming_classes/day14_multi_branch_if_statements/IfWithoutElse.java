package java_programming_classes.day14_multi_branch_if_statements;

public class IfWithoutElse {
    public static void main(String [] args){
        int year = 2020;
        if (year == 2020) {
            System.out.println("Covid19 pandemic year");
            System.out.println("Wear your mask");
        }
        System.out.println("Keep coding");
        String country = "USA";
        if (country.equals("USA")) {
            System.out.println("Washington DC is capital");
        }
        System.out.println("Welcome to " + country);
    }
}
