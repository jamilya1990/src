package practice_self_study_assignments.practice_self_study_03_30_2021;

import java.util.Random;

public class RandomNumberOf6UniqueDigits {
    public static void main(String[] args) {
        Random random = new Random();
        String sixDigits = "";
        do {
                int index = random.nextInt(10);
                String uniqueDigits = index + " ";
                if (!sixDigits.contains(uniqueDigits)) {
                    sixDigits += "" + index + " ";
                    index++;
                } else {
                    continue;
                }
            }
            while (sixDigits.length() <= 11);
            System.out.println(sixDigits);
        }
    }

