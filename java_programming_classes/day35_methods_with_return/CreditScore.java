package java_programming_classes.day35_methods_with_return;

public class CreditScore {
    //method name:
    //    checkEligible
    //input/parameter:
    //    int creditScore
    //
    //if creditScore is 700 or more
    //    you are eligible for leasing this car
    //otherwise
    //    Sorry, you are not eligible for leasing this car
    public static void checkEligible(int creditScore){
        if(creditScore>=700){
            System.out.println("You are eligible for this car!");
        }else{
            System.out.println("Sorry, you are not eligible for leasing this car");
        }
    }

    public static void main(String[] args) {
        checkEligible(820);

        System.out.println((getCreditScore()));
        checkEligible(getCreditScore());
    }
    public static int getCreditScore(){
        return 800;
    }
}
