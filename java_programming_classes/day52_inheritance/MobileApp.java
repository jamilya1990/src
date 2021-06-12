package java_programming_classes.day52_inheritance;

public class MobileApp {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    private String name;
    private double version;

    protected boolean download(){
        System.out.println("App: " + name + " version " + version+ " is downloaded" );
        return true;
    }

    String message(String message){

        message ="Message from main MobileApp class";
        return message;
    }

    public void useTheApp(int minutes){
        System.out.println(name +" is using app for " + minutes+" minutes");
    }



}
