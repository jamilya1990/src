package practice_self_study_assignments.practice_self_study_loop3_04_04_2021;

public class PrimeInRange {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        //System.out.println("Enter number:");
        int number = 50;
        String count = "";
        for (int i = 1; i <= number; i++) {
            int primeNumbers = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    primeNumbers += 1;
                }
              }
            if(primeNumbers==2){
                count += " "+i;
            }
        }
        System.out.println("Prime numbers of count up to "+number+" :"+count);
    }
}
