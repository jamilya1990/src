package java_programming_classes.day44_custom_classes;

public class MyApps {
    public static void main(String[] args) {
        App newApp = new App();
        newApp.name = "FB";
        System.out.println(newApp.name);

        newApp.version = "6.0";
        System.out.println(newApp.version);
        
        newApp.open(newApp.name, newApp.version);
    }
}
