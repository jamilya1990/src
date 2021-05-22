package java_programming_classes.day09_scanner_practice;

import java.util.Scanner;

public class FtoCelcius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scan here is variable name and anything can be used
        System.out.println("Enter Temperature in Fahrenheit:");
        double tempFahrenheit = scan.nextDouble();
        double tempCelsius = (tempFahrenheit - 32)*5/9;
        System.out.println("Celsius: " + tempCelsius);
    }
}

