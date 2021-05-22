package java_programming_classes.day16_switch_ternary;

public class Apartment {
    public static void main(String[] args) {
        int bedrooms = 0; //0, 1, 2
        double startingPrice = 0.0;
        //print "Two bedroom apartment selected"
        if(bedrooms == 2) {
        }
        switch (bedrooms){
            case 0:
                System.out.println("Studio selected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("One bedroom selected");
                startingPrice = 1725;
                break;
            case 2:
                System.out.println("Two bedroom selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println(bedrooms + " bedroom is not available yet");
        }
        System.out.println("Starting Price: " + startingPrice);
    }
}
