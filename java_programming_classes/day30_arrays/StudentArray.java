package java_programming_classes.day30_arrays;

import java.util.Locale;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[]{"123", "Jamilya", "Petsenyuk", "22", "9165053829"};
        String[] strings2 = {"456", "John", "Doe", "22", "9187876766"};
        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstName= " + student1[1]);
        System.out.println("student1 lastName = " + student1[2]);
        System.out.println("student1 = " + student1[3]);
        System.out.println("student1 = " + student1[4]);
        if(student1.length==5){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if(student1.length==strings2.length){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        System.out.println(student1[1].toUpperCase(Locale.ROOT) + " "+student1[2].toUpperCase(Locale.ROOT));
    }
}
