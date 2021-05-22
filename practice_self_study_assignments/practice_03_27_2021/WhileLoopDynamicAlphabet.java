package practice_self_study_assignments.practice_03_27_2021;

import java.util.Scanner;

public class WhileLoopDynamicAlphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Upper or Lower");
        String upperOrLower = scan.next();
        while (!upperOrLower.equalsIgnoreCase("upper") || !upperOrLower.equalsIgnoreCase("lower")) {
            System.out.println("Please enter \"upper\" or \"lower\":");
            upperOrLower = scan.next();
            char letter = 65;
            if (upperOrLower.equalsIgnoreCase("upper")) {
                System.out.println("Ascending or Descending Order?");
                String order = scan.next();
                while (!order.equalsIgnoreCase("ascending") || !order.equalsIgnoreCase("descending")) {
                    System.out.println("Please enter \"ascending\" or \"descending\":");
                    order = scan.next();
                    if (order.equalsIgnoreCase("ascending")) {
                        letter = 65;
                        while (letter <= 90) {
                            System.out.println(letter);
                            letter++;
                        }
                    } else if (order.equalsIgnoreCase("descending")) {
                        letter = 90;
                        while (letter >= 65) {
                            System.out.println(letter);
                            letter--;
                        }
                    }
                }
            } else if (upperOrLower.equalsIgnoreCase("lower")) {
                System.out.println("Ascending or Descending Order?");
                String order = scan.next();
                while (!order.equalsIgnoreCase("ascending") || !order.equalsIgnoreCase("descending")) {
                    System.out.println("Please enter \"ascending\" or \"descending\":");
                    order = scan.next();
                    if (order.equalsIgnoreCase("ascending")) {
                        letter = 97;
                        while (letter <= 122) {
                            System.out.println(letter);
                            letter++;
                        }
                    } else if (order.equalsIgnoreCase("descending")) {
                        letter = 122;
                        while (letter >= 97) {
                            System.out.println(letter);
                            letter--;
                        }
                    }
                }
            }
        }
    }
}
