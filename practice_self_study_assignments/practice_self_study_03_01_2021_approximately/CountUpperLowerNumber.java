package practice_self_study_assignments.practice_self_study_03_01_2021_approximately;

public class CountUpperLowerNumber {
    public static void main(String[] args) {
        String str = "java is fun. java class today, not javaScript java";
        int count = 0;
        while(str.contains("java")){
            count++;
            str = str.replaceFirst("java", "");//
        }
        System.out.println("Java was found " + count + " times");


        // another approach

        for(int i=0; i<str.length()-3; i++){
            String eachFourLetters = str.substring(i,i+4);
            if(eachFourLetters.equals("java")){
                count++;
            }
        }
        System.out.println(count);
    }
}
