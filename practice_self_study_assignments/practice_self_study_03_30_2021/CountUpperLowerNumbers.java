package practice_self_study_assignments.practice_self_study_03_30_2021;

public class CountUpperLowerNumbers {
    public static void main(String[] args) {
        int upperCase = 0;
        int lowerCase = 0;
        int numbers = 0;
        String str = "2juMp41EEkd4s4";
        for (int i=0; i<str.length(); i++ ){
            if(str.charAt(i)>='A' && str.charAt(i) <='Z'){
                upperCase+=1;
            } else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                lowerCase +=1;
            } else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                numbers +=1;
            }
        }
        System.out.println(" Upper Case: " + upperCase + " Lower Case: "+ lowerCase + " Numbers: " + numbers);
    }
}
