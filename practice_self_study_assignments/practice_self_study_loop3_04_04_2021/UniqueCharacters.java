package practice_self_study_assignments.practice_self_study_loop3_04_04_2021;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "AAcABBBBFCCCCD";
        for (int i = 0; i < str.length(); i++) {
            if(!str.substring(i+1).contains(str.charAt(i)+"") && !str.substring(0, i).contains(str.charAt(i)+"")){
                System.out.print(str.charAt(i));
            }
        }
    }
}
