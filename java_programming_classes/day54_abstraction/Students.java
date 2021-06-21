package java_programming_classes.day54_abstraction;

public abstract class Students {

    public void code(String language){
        System.out.println("Student is coding using " + language);
    }

    public abstract void attendClass();
}

class OnlineStudent extends Students{
    public void attendClass(){
        System.out.println("Online Student attending class using Zoom");
    }
}

class StudentObjects{
    public static void main(String[] args) {
        OnlineStudent student1 = new OnlineStudent();
        student1.code("Java");
        student1.attendClass();
    }
}
