package practice_self_study_assignments.practice_self_study_03_01_2021_approximately;

public class Apartment {
    public static void main(String[] args){

        String address = "925 Old Placerville Road, Sacramento, CA, 95827";
        String nameOfOwner = "Jamilya Petsenyuk";
        byte numberOfUnits = 10;
        float averageSizeOfEachUnit = 1085f;
        float monthlyRent = 1595f;
        byte numberOfWasherAndDriers = 20;
        boolean allowsPets = true;
        boolean hasPool = true;
        byte lengthOfLeaseMonths = 12;
        int totalNumberOfResidents = 35;
        long phoneNumberOfOwner = 9165953821L;
        boolean isNearGasStation = true;
        byte numberOfFloors = 2;
        boolean hasAvailableUnitsForRent = false;
        int numberOfParkingSpaces = 25;
        System.out.println("    ***** \"Dream Apartments\" *****");
        System.out.println();
        System.out.println("Apartment Address:\t\t\t\t" + address);
        System.out.println("Name of the Owner:\t\t\t\t" + nameOfOwner);
        System.out.println("Number of Units:\t\t\t\t" + numberOfUnits);
        System.out.println("Average Size of each Unit:\t\t" + averageSizeOfEachUnit + " sq.ft");
        System.out.println("Monthly rent:\t\t\t\t\t$" + monthlyRent);
        System.out.println("Number of Washer and Driers:\t" + numberOfWasherAndDriers);
        System.out.println("Allows Pets or not:\t\t\t\t" + allowsPets);
        System.out.println("Has pool:\t\t\t\t\t\t" + hasPool);
        System.out.println("Length of Lease:\t\t\t\t" + lengthOfLeaseMonths + " months");
        System.out.println("Phone number of the Owner:\t\t" + phoneNumberOfOwner);
        System.out.println("Is near gas station:\t\t\t" + isNearGasStation);
        System.out.println("Number of floors:\t\t\t\t" + numberOfFloors);
        System.out.println("Has available units for rent:\t" + hasAvailableUnitsForRent);
        System.out.println("Number of parking spaces:\t\t" + numberOfParkingSpaces);
        double monthlyRentAfter3Years = monthlyRent - (monthlyRent % 10);
        double monthlyRentAfter6Years = monthlyRent - (monthlyRent % 20);
        double averageNumberOfResidentsPerUnit = totalNumberOfResidents / numberOfUnits;
        double averageNumberOfParkingSpotsPerUnit = numberOfParkingSpaces / numberOfUnits;
        double averageNumberOfUnitsPerFloor = numberOfUnits / numberOfFloors;
        System.out.println();
        System.out.println("======== Apartment Information ========");
        System.out.println();
        System.out.println("Monthly rent after 3 years:\t\t\t\t\t\t$" + monthlyRentAfter3Years);
        System.out.println("Monthly rent after 6 years:\t\t\t\t\t\t$" + monthlyRentAfter6Years);
        System.out.println("Average number of residents per unit: \t\t\t" + averageNumberOfResidentsPerUnit);
        System.out.println("Average number of parking spots per unit:\t\t" + averageNumberOfParkingSpotsPerUnit);
        System.out.println("Average number of units per floor:\t\t\t\t" + averageNumberOfUnitsPerFloor);




    }
}
