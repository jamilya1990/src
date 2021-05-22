package java_programming_classes.day23_string_manipulations_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
       int num = 2;
       boolean b = true;
       switch(num) {
           case 2:
               if(b){
                   System.out.println(2);
               }else{
                   b = false;
               } case 3:
                   if (b){
                       System.out.println(3);
                       b = false;
                   }else {
                       break;
                   } case 4 :
               System.out.println(4);
           case 5:
               if (!b) {
                   break;
               }
               System.out.println(5);
       }
        }
    }
