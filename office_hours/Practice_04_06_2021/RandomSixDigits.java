package office_hours.Practice_04_06_2021;

import java.util.Random;

public class RandomSixDigits {
    public static void main(String[] args) {
        Random random = new Random();
        String myRandomNumber = "";
        while(myRandomNumber.length()!=6){
            int eachRandom = random.nextInt(10);
            if(!myRandomNumber.contains(eachRandom+"")){
                myRandomNumber +=eachRandom;
            }
        }
        System.out.println(myRandomNumber);
        //System.out.println(random.nextInt(10));//random number from 0-9
    }
}
