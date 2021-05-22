package interview_questions_java;

public class NumbersArmstrongNumber {
    public static void main(String[] args) {
        //Numbers -- Armstrong numbers
        //Write a method that can check if a number is Armstrong  number
        int number = 9474;//153, 370, 1634, 8208, 9474
        int a = 0;
        int b=0;
        int c=0;
        int d=0;
        boolean isArmstrong = false;
        for (int i = 0; i <=9 ; i++) {
            if(i == number%10){//to get the last number 1s
                a = i;
            }if (i==number/10%10){//150/10=15%10=5 To get the number of 10s
                b = i;
            }if (i==number/100%10) {//1653: 16%10 = 6; 153: 1%10=1 To get the number of 100s.
                c = i;
            }if (i==number/1000%10) {//1653: 1%10=1;  To get the number of 1000s
                d = i;
            }if(d==i && (a*a*a*a + b*b*b*b + c*c*c*c + d*d*d*d)==number){//checking if number is 4 digit long
                isArmstrong=true;
            }else if(d!=i && (a*a*a + b*b*b + c*c*c)==number){//checking is number is 3 digit long
                isArmstrong=true;
            }
        }
        System.out.println(isArmstrong);
    }
}
