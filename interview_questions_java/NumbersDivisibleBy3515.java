package interview_questions_java;

public class NumbersDivisibleBy3515 {
    public static void main(String[] args) {
        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";
        for (int i = 1; i < 100; i++) {
            if(i%15==0){
                divisibleBy15+=" " + i;
            } if(i%5==0 && i%15!=0){
                divisibleBy5 += " " + i;
            } if(i%3==0 && i%15!=0){
                divisibleBy3 += " "+i;

            }

        }
        System.out.print("Divisible by 15: "+divisibleBy15);
        System.out.print("\nDivisible by 5: "+divisibleBy5);
        System.out.print("\nDivisible by 3: "+divisibleBy3);

    }
}
