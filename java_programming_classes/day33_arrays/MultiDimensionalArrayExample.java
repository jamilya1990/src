package java_programming_classes.day33_arrays;

import java.util.Arrays;

public class MultiDimensionalArrayExample {
    public static void main(String[] args) {
        String[][] users = new String[3][2];
        users[0][0]= "Theodora Tsvetanov";
        users[0][1] = "TheodoraPWD12";
        users[1][0] = "Anna Ziyayeva";
        users[1][1] = "Anna123";
        users[2][0] = "Parvin Altae";
        users[2][1] = "Parvine123";

        String[][] userData = {{"Theodora Tsvetanov","TheodoraPWD12" }, {"Anna Ziyayeva", "Anna123"},{"Parvin Altae","Parvine123" } };
        //print all names
        System.out.println(userData[0][0]);
        System.out.println(userData[1][0]);
        System.out.println(userData[2][0]);
        //print all passwords
        System.out.println(userData[0][1]);
        System.out.println(userData[1][1]);
        System.out.println(userData[2][1]);
        //IF YOU WANT TO GET ONLY FIRST NAME
        System.out.println(userData[0][0].split(" ")[0]); // will print first index of splitted Full name - Theodora
        //to print all values of MultiDimensional Array
        System.out.println(Arrays.deepToString(userData));
    }
}
