package java_programming_classes.day28_loops;

public class JavaCityCases {
    public static void main(String[] args) {
        int totalCases = 0;
        for(int i=1; i<=30; i++){
            if (i%7 == 0){
                totalCases+=500;
            }else{
                totalCases+=200;
            }
        }
        System.out.println(totalCases);
    }
}
