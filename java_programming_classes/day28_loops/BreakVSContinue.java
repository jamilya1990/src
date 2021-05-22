package java_programming_classes.day28_loops;

public class BreakVSContinue {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            if (i==2){
                continue;
            }else if(i==4){
                break;
            }
            System.out.println(i);
        }
    }
}
