package java_programming_classes.day52_inheritance;

public class Instagram extends MobileApp{
    public void postPhoto(){
        System.out.println(getName()+" is posting photo on Instagram");
    }
    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        System.out.println(getName() +" is using Instagram app for " + minutes+" minutes");
        postPhoto();
    }

    @Override
    protected boolean download() {
        System.out.println("Overrided protected method from MobileApp class to Instagram class");
        return super.download();

    }
    @Override
    String message(String message){
        return super.message(message);
    }
}
