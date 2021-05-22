package java_programming_classes.day29_nested_loops_arreys;

public class NestedForLoop {
    public static void main(String[] args) throws InterruptedException {
        for(int minutes = 1; minutes <= 11; minutes++){
            System.out.println("\nminutes = "+minutes);
            for(int seconds = 1; seconds <=60; seconds++){
                System.out.print(seconds+" ");
                //Thread.sleep(1000);
            }
        }
        for(int minutes = 0; minutes<=4; minutes++){
            for(int seconds = 0; seconds<=59; seconds++){
                System.out.println(minutes + ":" + seconds);
            }
        }
    }
}
