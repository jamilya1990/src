package java_programming_classes.day61_exceptions_collections.checked_exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromFile {
    public static void main(String[] args) {
        String filePath = "java_programming_classes/day61_exceptions_collections/checked_exceptions/data.txt";
        //Files.readAllLines(Paths.get(filePath));
        try {

            List<String> data = Files.readAllLines(Paths.get(filePath));
            for (String line : data) {
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("---------The End----------");
    }
}
