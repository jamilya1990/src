package practice_self_study_assignments.practice_03_03_2021;

public class OperatorsV3 {
    public static void main(String[] args) {
        int x = 300;
        int y = 400;
        int z = x + y - x*y + x/y; // 300 + 400 - 300*400 + 300/400 = 700 - 120000 + 3/4 = -119300 +
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

    }
}
