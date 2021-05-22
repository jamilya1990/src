package practice_self_study_assignments.practice_03_03_2021;

public class TernaryOperatorLoan {
    public static void main(String[] args) {
        double yearlySalary = 100_000;
        int creditScore = 785;
        String loan = (yearlySalary > 60_000 && creditScore > 650) ? "Load Approved" : "Loan Denied";
        System.out.println(loan);

        String sport = "tennis";
        int fee = (sport.equals("tennis") || sport.equals("soccer"))? 100 : 50;
        System.out.println("fee = " + fee);
    }
}
