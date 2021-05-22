package java_programming_classes.day05_primitives_concatanation;

public class HouseExercise {
    public static void main(String[] args) {
     /*   1) Create a class House
    create a main method

        - Each the datatype you feel is most appropriate for each variable.

        - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?,
        is there an attic, is there a pool, is the house for sale?, cost of the house, address,
        zipcode, is a park near by, Rating of surrounding school districts (out of 5),
        - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
        The number of bathrooms is: 3 */

        String houseType = "House";
        byte numberOfBedrooms = 5;
        byte numberOfBathrooms = 3;
        byte numberOfKitchens = 1;
        boolean isThereABasement = true;
        boolean isThereAnAttic = true;
        double costOfTheHouse = 400500.535;
        String address = "4545 Oak Way Drive";
        int zipcode = 95843;
        byte schoolRating = 5;

        System.out.println("House Type:\t\t\t\t" + houseType + "\nNumber of Bedrooms:\t\t" + numberOfBedrooms +
                "\nNumber of Bathrooms:\t" + numberOfBathrooms + "\nNumber of Kitchens:\t\t" + numberOfKitchens
                + "\nIs there a basement?\t" + isThereABasement + "\nIs there an attic?\t\t" + isThereAnAttic
                + "\nCost of the house\t\t$" + costOfTheHouse + "\nAddress:\t\t\t\t" + address + "\nZipcode\t\t\t\t\t"
                + zipcode + "\nSchool Rating:\t\t\t" + schoolRating);
    }
}




