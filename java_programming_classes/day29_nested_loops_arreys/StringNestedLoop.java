package java_programming_classes.day29_nested_loops_arreys;

public class StringNestedLoop {
    public static void main(String[] args) {
        String word= "java";
        for(int i= 0; i<word.length(); i++){
            for(int j = 0; j<=i; j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
        for(int i= 0; i<word.length(); i++){
            for(int j = i; j<word.length(); j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
        for (int outer = 0; outer< word.length(); outer++){
            char outerChar = word.charAt(outer);
            int count = 0;
            for(int inner = 0; inner< word.length(); inner++){
                char innerChar = word.charAt(inner);
                if(outerChar == innerChar){
                    count++;
                }
            }                System.out.println(outerChar + " = " + count);

        }
    }
}
