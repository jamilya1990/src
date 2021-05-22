package practice_self_study_assignments.practice_Self_Study_03_20_21;

public class SwitchHouseOccupants {
    public static void main(String[] args) {
        String houseType = "Apartment";
        int maxOccupants = 0;
        switch (houseType){
            case "Apartment":
                maxOccupants = 4;
                break;
            case "Tree house":
                maxOccupants = 1;
                break;
            case "Mobile home":
                maxOccupants = 2;
                break;
            case "Town house":
                maxOccupants = 6;
                break;
            case "Villa":
                maxOccupants = 8;
                break;
            case "Mansion":
                maxOccupants = 10;
        }
        System.out.println("Maximum number of occupants allowed in " + houseType + " is " + maxOccupants);
    }
}
