package practice_self_study_assignments.practice_03_03_2021;

public class OperatorsV2 {
    public static void main(String[] args) {
        int a = 200;
        int b = -a++ + - --a * a-- % 2 + a; // -200 +1 + (-198 * 198 - 1) % 2 + 197 =
        //-199 + ((-39205)%2)=1 + 197 = -1
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
