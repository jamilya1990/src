package java_programming_classes.day54_abstraction;

public class CampusStudents extends Students {

    @Override
    public void attendClass() {
        System.out.println("Overriden method in CampusSrudent class of Student class");
    }
}
