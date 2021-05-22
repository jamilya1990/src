package practice_self_study_assignments.practice_03_03_2021;

public class EligibleToVoteInUSA {
    public static void main(String[] args) {
        boolean isUSCitizen = true;
        int age = 30;
        if (isUSCitizen) {
            String eligibleToVote = age>=18 ? "Eligible to Vote" : "Not Eligible to Vote";
            System.out.println(eligibleToVote);
        } else {
            System.out.println("You must be US citizen to vote");
        }
    }
}
