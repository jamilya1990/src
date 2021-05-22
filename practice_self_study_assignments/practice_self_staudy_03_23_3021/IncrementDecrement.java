package practice_self_study_assignments.practice_self_staudy_03_23_3021;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 10; //11
        int b = a++;//10
        int c = b; //11

        //int c = a++ + --b + a-- + b-- + b*2;
        // 11 + 9 + 12 + 9 + 8*2 = 20 + 21 + 16 = 57
        int d = a++ + --b + c-- + a-- + b-- + b*2; //11 + 9 + 11 + 11 + 9 + 8*2 = 42+25=67
        System.out.println(a + ", " + b + ", " + c + ", " + d);

    }
}
