package java_programming_classes.day26_loops;

public class PrintChar {
    public static void main(String[] args) {
        //String word = "java";
        //System.out.println(word.length());
       // for(int i = word.length()-1; i>=0; i--){
         //   System.out.print(word.charAt(i));
            String sentence = "python and java";
            int javaCount = 0;
            int pythonCount = 0;
            for (int i = 0; i<sentence.length()-5; i++){
                if(sentence.charAt(i)=='j' && sentence.charAt(i+1)=='a' && sentence.charAt(i+2)=='v' && sentence.charAt(i+3)=='a'){
                    javaCount +=1;
                }
                if(sentence.charAt(i)=='p' && sentence.charAt(i+1)=='y' && sentence.charAt(i+2)=='t' && sentence.charAt(i+3)=='h' && sentence.charAt(i+4)=='o' && sentence.charAt(i+5)=='n'){
                    pythonCount +=1;
                }

            } if(javaCount==pythonCount){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
    }

