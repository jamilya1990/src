package practice_self_study_assignments.practice_03_03_2021;

public class OperatorsV1 {
    public static void main(String[] args){
        int a = 5;
        int b = a++ + a-- + a * 2 +a + ++a;// 5 + 1 + 6 - 1 + 10 + 5 + 6 = 32
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
