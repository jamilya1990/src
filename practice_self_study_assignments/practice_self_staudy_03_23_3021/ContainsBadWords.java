package practice_self_study_assignments.practice_self_staudy_03_23_3021;

public class ContainsBadWords {
    public static void main(String[] args){
        String message = "Hello there heck";
        String messageCheck = message.contains("idiot") || message.contains("dumb") || message.contains("heck") ? "Message not sent" : "Message sent";
        System.out.println(messageCheck);
    }
}
