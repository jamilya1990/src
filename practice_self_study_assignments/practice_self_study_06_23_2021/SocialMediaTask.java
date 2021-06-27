package practice_self_study_assignments.practice_self_study_06_23_2021;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class SocialMediaTask {
    /**
     * Social Media
     * •Create an abstract class for Social Media that has the following features:
     * -Direct messaging(String username, String message)
     * -Post(String body)
     * -Notifications()
     * •The Social Media will also have the following fields:
     * -Personal URl (String)
     * -Account length (int)
     * -Platform (static String)
     */
    String personalURL;
    int accountLength;
    static String platform;

    public abstract void directMessaging(String username, String message);
    public abstract void post(String body);
    public abstract void notifications();
}

/**
 * Post class
 * •Create a class that has the following instance variable:String body, and String dateTime
 *      -Encapsulate body. Provide a public getter and setter(update)
 *      -Make dateTime final and read only (getter)
 * •Create a constructor that will take the body and initialize the body instance variable.
 * Upon creation of the post the current date and time should be taken and stored into the dateTime variableNote:
 * Since we didn’t learn this class use the follow code:
 *      this.dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a"));
 * Need to have these two imports for the above code:
 *      import java.time.LocalDateTime;
 *      import java.time.format.DateTimeFormatter;
 */
class BodyAndTime{
    private String body;
    private final String dateTime;//LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a"));

    public BodyAndTime(String body){
       // this.dateTime = dateTime;
        setBody(body);
        this.dateTime= LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a"));
    }
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body=body;
    }

    public String getDateTime() {

        return dateTime;
    }




}
