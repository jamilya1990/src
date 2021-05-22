package java_programming_classes.day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Jamilya";
        emp1.jobTitle = "Senior SDET";
        emp1.work();

        Employee emp2 = new Employee();
        emp2.name = "Yaroslav";
        emp2.jobTitle = "Project Manager";
        emp2.work();

        Employee emp3 = new Employee();
        emp3.name = "Samuel";
        emp3.jobTitle = "CEO";
        emp3.work();

        }
    }
