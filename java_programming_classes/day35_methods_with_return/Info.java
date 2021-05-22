package java_programming_classes.day35_methods_with_return;

import java.util.Random;

public class Info {
    public static String fullName(){
        return "Mike Smith";
    }
    public static boolean isMarried(){
        return false;
    }
    public static int getAge(){
        int age = 35;
        return age;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }

    public static void main(String[] args) {
        System.out.println(getRandomYear());

        String name = fullName();
        int age = getAge();
        int year = getRandomYear();
        boolean married = isMarried();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("married = " + married);
        System.out.println("year = " + year);
    }

}
