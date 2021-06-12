package java_programming_classes.day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp app1 = new MobileApp();
        app1.setName("Jamilya");
        app1.setVersion(1.0);

        app1.useTheApp(10);

        Instagram insta = new Instagram();
        insta.setName("J31");
        insta.useTheApp(20);

        Discord discord = new Discord();
        discord.setName("Alma");
        discord.useTheApp(15);
    }
}
