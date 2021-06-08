package java_programming_classes.day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Ivan Ivanovich";
        p1.age = 50;
        //methods from Person class
        p1.work("Physics");
        p1.talk();
        p1.walk();

        Teacher t1 = new Teacher();
        //using teacherID from Teacher class, which was added as extension to Person class
        t1.teacherID = 1234;
        //re-using variables initialized in parent/base/super class Person
        t1.name = "Saim";
        t1.age = 45;
        //re-using methods initialized in parent/base/super class Person
        t1.teach("Math");
        t1.walk();
        t1.talk();

        Student st1 = new Student();
        st1.name = "Jamilya";
        st1.age = 31;
        st1.talk();
        st1.walk();
        st1.work("SDET");
    }
}
