package java_programming_classes.day17_ternary_operator_compose;
import java.util.Scanner;
public class HouseTypeInfo {
    public static void main(String[] args) {
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your property type:");
        houseType = scan.nextLine();

        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        propertyPrice = numberOfBedrooms * 30_000;
        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();
        if (backyard && houseType.equals("Condo")){
            System.out.println("Backyard is not available for condo!");
        } else{
            propertyPrice += 5_000;
        }
        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();
        if (garage){
            System.out.println("How many spots?");
            garageSpots = scan.nextInt();
            if (garageSpots<=10) {
                propertyPrice += garageSpots * 20_000;
            } else {
                System.out.println("Pardon, it's not public parking!");
            }
        }
        System.out.println("How close is metro station?");
        metroAccessibility = scan.nextFloat();
        if (metroAccessibility<=1) {
            propertyPrice +=10_000;
        } else if (metroAccessibility>1 && metroAccessibility <=3) {
            propertyPrice += 5_000;
        }
        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextFloat();
        if (highwayAccessibility<=1) {
            propertyPrice += 15_000;
        } else if (highwayAccessibility>1 && highwayAccessibility<=5) {
            propertyPrice += 8_000;
        } else if (highwayAccessibility>5 && highwayAccessibility<=20) {
            propertyPrice += 4_000;
        }
        System.out.println("What's the rating of nearest school?");
        schoolScore = scan.nextFloat();
        if (schoolScore >= 8 && schoolScore <=10) {
            propertyPrice +=45_000;
        } else if (schoolScore >= 4 && schoolScore <= 8) {
            propertyPrice += 20_000;
        } else {
            propertyPrice += 5_000;
        }
        System.out.println("Does any of your family members smoke?");
        smoking = scan.nextBoolean();
        if (smoking) {
            propertyPrice -= 5_000;
        }

        if(houseType.equals("Condo")){
            propertyPrice += 50_000;
        } else if (houseType.equals("Townhouse")){
            propertyPrice +=75_000;
        } else if (houseType.equals("Single Family House")) {
            propertyPrice +=95_000;
        }
        System.out.println("Market report has been generated.\nYour estimate market price is: " + propertyPrice);










    }
    }

