package java_programming_classes.day52_inheritance;

public class Discord extends MobileApp{
    public void chatting(String  someone){
        System.out.println(getName() + " is chatting on Discord with "+someone);
    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        chatting("Zayka");

    }
}
