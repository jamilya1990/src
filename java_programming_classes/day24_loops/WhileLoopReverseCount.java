package java_programming_classes.day24_loops;

public class WhileLoopReverseCount {
    public static void main(String[] args) {
        int count = 5;
        while (count >=0) {
            System.out.println("count = " + count);
            count--;
        }
        System.out.println("Finished counting");

        int unreadSMS = 10;
        while (unreadSMS >=0) {
            System.out.println("you have unread SMS: " + unreadSMS);
            System.out.println("Finished reading SMS  and starting new one");
            unreadSMS--;
        }
        System.out.println("Finished All");
    }
}
