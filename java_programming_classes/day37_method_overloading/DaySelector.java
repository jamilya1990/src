package java_programming_classes.day37_method_overloading;

public class DaySelector {
    public static String getDayName(int day){
        switch (day){
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                System.out.println("invalid day " + day);
                return null;
        }
    }

    public static void main(String[] args) {
        //System.out.println(getDayName(3));
        for (int i = 1; i <=8; i++) {
            System.out.println(getDayName(i));
        }
    }
}
