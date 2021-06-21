package java_programming_classes.day54_abstraction;

public class Sport {
    String name;
    int numOfPlayers;
    boolean teamBase;

    @Override
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numOfPlayers=" + numOfPlayers +
                ", teamBase=" + teamBase +
                '}';
    }

    public void makeSport(String name1, int num1, boolean base){
        name = name1;
        numOfPlayers = num1;
        teamBase = base;
    }

    public static void main(String[] args) {
        Sport soccer = new Sport();
        soccer.makeSport("Soccer", 22,true );
        System.out.println(soccer);
    }

}
