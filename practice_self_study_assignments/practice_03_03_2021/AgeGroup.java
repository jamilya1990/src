package practice_self_study_assignments.practice_03_03_2021;

public class AgeGroup {
    public static void main(String[] args) {
        int age = 85;
        if (age<=0 || age>=120){
            System.out.println("Invalid Entry");
        } else {
            if (age <1) {
                System.out.println("Infant");
            } else if (age >= 3 && age <=5){
                System.out.println("Toddler");
            } else if (age >=6 && age <=9) {
                System.out.println("Kids");
            } else if (age >=10 && age <=12) {
                System.out.println("Pre-teen");
            } else if (age >=13 && age <=17) {
                System.out.println("Teenager");
            } else if (age >=18 && age <= 20) {
                System.out.println("Young Adult");
            } else if (age >=21 && age<=39) {
                System.out.println("Adult");
            } else if (age >=40 && age<=49){
                System.out.println("Young middle age adult");
            } else if (age >= 50 && age <=84){
                System.out.println("Senior");
            } else {
                System.out.println("Old Senior Citizen");
            }
        }
    }
}
