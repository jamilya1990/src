package java_programming_classes.day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String [] args) {
        String carModel = "Honda Pilot";
        String driverName = "Jamilya Petsenyuk";
        String licenseNum = "SJC9900";
        byte speed = 65;
        boolean isAutomatic = true;
        char licenseClass = 'C';
        System.out.println("Car model:\t\t\t\t" + carModel
        + "\nDriver's Name\t\t\t" + driverName + "\nLicense Number:\t\t\t" + licenseNum + "\nSpeed:\t\t\t\t\t"
                + speed + "\nIs car automatic:\t\t" + isAutomatic
                + "\nDriver License Class:\t" + licenseClass);
        System.out.println(driverName + " is driving " + carModel);
    }
}
