package java_programming_classes.day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo str1 = new StaticBlockDemo();//num=10+5
        //Static Initializer block block will run ONCE +
        // + Initializer Block will run before Constructor, THEN Constructor method will run
        StaticBlockDemo str2 = new StaticBlockDemo();//num=10+5+5
        //Initializer Block will run before Constructor, THEN Constructor method will run
        StaticBlockDemo str3 = new StaticBlockDemo();//num=10+5+5+5=25
        //Initializer Block will run before Constructor, THEN Constructor method will run

        System.out.println(StaticBlockDemo.num);//num=25
        StaticBlockDemo str4 = new StaticBlockDemo(50);
        System.out.println(StaticBlockDemo.num);

    }
}
