package java_programming_classes.day17_ternary_operator_compose;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = hourlyRate > 45 ? "accept" : "reject";
        System.out.println("reply = " + reply);

        boolean isEligibleToDrive = true;
        String driving = isEligibleToDrive? "Has DL and can drive" : "No DL and cannot drive"; //it is already boolen and no need to make isEligibleToDrive = true
        System.out.println("driving = " + driving);
    }
}
