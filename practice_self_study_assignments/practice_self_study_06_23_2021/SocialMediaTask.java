package practice_self_study_assignments.practice_self_study_06_23_2021;

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


