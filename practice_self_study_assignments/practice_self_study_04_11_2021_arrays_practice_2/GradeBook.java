package practice_self_study_assignments.practice_self_study_04_11_2021_arrays_practice_2;

public class GradeBook {
    public static void main(String[] args) {
        //Declarethreearrays:1.String array which will hold names for the students (give values)2.Int array which has the score of the student got in the quiz (give values)3.Char array which will have some letter grade based on the score (empty)4.Output the gradebook at the end with all the information Grade scale:Above85: AAbove75:BAbove 65: COther: D
        String[] names = {"Mike", "Joe", "Ana", "Ali", "Joanna"};
        int[] scores = {80, 54, 100, 66, 94};
        //declared new empty array with size same as other 2 arrays
        char[] grades = new char[names.length];
        for(int i=0, j=0; i< scores.length; j++, i++){
            if(scores[i]>=85){
                grades[j]='A';
            }else if(scores[i]>=75){
                grades[j]='B';
            }else if(scores[i]>=65){
                grades[j]='C';
            }else{
                grades[j]='D';
            }
            System.out.println(names[i] + " | " + grades[i] + " | " + scores[i]);
        }
    }
}
