package practice_self_study_assignments.practice_self_study_03_24_2021;

public class SMSPart {
    public static void main(String[] args) {
        String text = "Sender:<James Bond>. From Number: [202-123-3456]. + Message: {\"I love programming and problem solving\"}";
        String sender = text.substring(text.indexOf("<")+1, text.indexOf(">"));
        String number = text.substring(text.indexOf("[")+1, text.indexOf("]")).replace("-", "");
       // number = number.replace("-", "");
        String message = text.substring(text.indexOf("{")+1, text.indexOf("}"));
        System.out.println("Sender:\t\t" + sender + "\nNumber:\t\t" + number + "\nMessage:\t" + message);

    }
}
