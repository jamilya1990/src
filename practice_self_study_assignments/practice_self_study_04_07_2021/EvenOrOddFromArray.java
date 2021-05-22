package practice_self_study_assignments.practice_self_study_04_07_2021;

public class EvenOrOddFromArray {
    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 88, 90, 23};
        String evenNumbers = "";
        String oddNumbers = "";
        for (int i:
             nums) {
            if(i%2==0){
                evenNumbers +=" "+i;
            }else if(i%2>0){
                oddNumbers +=" "+i;
            }
        }
        System.out.print("Even Numbers: "+evenNumbers +"\nOdd Numbers: "+oddNumbers);
    }
}
