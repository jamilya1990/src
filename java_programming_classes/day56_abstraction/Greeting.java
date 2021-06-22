package java_programming_classes.day56_abstraction;

interface Greeting {
    void hi(); //public abstract by default
    void bye(); ////public abstract by default
}
class MountainLanguage implements Greeting{

    @Override
    public void hi() {
        System.out.println("Privet");
    }

    @Override
    public void bye() {
        System.out.println("Do svidaniya");
    }
}