package ReprilPractice.methods;

public class isPalindrome {
    public static void main(String[] args) {
        int num = 123438921;
        int numTemp = num;
        int reverse = 0;
        for (int i = 0; i<=numTemp ; i++) {
            if(i==numTemp%10) {
                int temp = numTemp%10;
                numTemp = numTemp / 10;
                reverse = reverse*10 + temp;
                i=0;
            }
        }
        System.out.println(reverse);
        boolean isPalindrome = num==reverse? true:false;
        System.out.println(isPalindrome);
    }
}
