package practice_self_study_assignments.practice_self_study_loop3_04_04_2021;
//this version prints all Prime numbers except last one - 49
public class PrimeNumbersV2 {
    public static void main(String[] args) {
        for (int i = 2; i <=50; i++) {
            int num = 0;
            for (int j = 2; j <i ; j++) {
                if(i%j==0){
                    num++;
                }
            }
            if(num==0){
                System.out.println(i+", ");
            }
        }
    }
}
