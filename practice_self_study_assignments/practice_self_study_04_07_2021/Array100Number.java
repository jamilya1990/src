package practice_self_study_assignments.practice_self_study_04_07_2021;

public class Array100Number {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for(int i : numbers){
            numbers[i]++;
            System.out.println(numbers[i]);
        }
    }
}
