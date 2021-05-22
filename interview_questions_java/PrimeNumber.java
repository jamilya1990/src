package interview_questions_java;

public class PrimeNumber {
    public static void main(String[] args) {
        //Numbers -- Prime Number
        //Write a method that can check if a number is prime or not
        int number= 11;
        int count=0;
        boolean isPrime = false;
        for (int i = 1; i <= number; i++) {
            if(number%i==0){
               count+=1 ;
            }
        }if(count==2){
            isPrime = true;
        }
        System.out.println(isPrime);

        int num= 50;
        String countOfPrimes = "";
        for (int i = 1; i <= num; i++) {
            int prime=0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    prime+=1;
                }
            }
            if (prime == 2) {
                countOfPrimes +=" "+i;
            }
        }
        System.out.println(countOfPrimes);
    }
}
