package practice_self_study_assignments.practice_03_03_2021;
import java.util.Scanner;
public class BakingContest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Judge Score 1:");
        int judge1 = scan.nextInt();
        System.out.println("Judge Score 2:");
        int judge2 = scan.nextInt();
        System.out.println("Judge Score 3:");
        int judge3 = scan.nextInt();
        System.out.println("Other person score 1:");
        double otherPersonScore1 = scan.nextDouble();
        System.out.println("Other person score 2:");
        double otherPersonScore2 = scan.nextDouble();
        double myScore = (judge1 + judge2 + judge3) / 3;
        if (myScore > otherPersonScore1 && myScore > otherPersonScore2) {
            System.out.println("First Place!");
        } else if ((myScore > otherPersonScore1 && myScore < otherPersonScore2) || (myScore>otherPersonScore2 && myScore < otherPersonScore1)) {
            System.out.println("Second Place");
        } else {
            System.out.println("Third Place");
        }
    }
}
