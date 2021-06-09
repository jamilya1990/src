package java_programming_classes.day51_inheritance;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.jobTitle = "SDET";
        System.out.println(Math.round(emp1.calculateSalary(55)));

        Contractor cont1 = new Contractor();
        cont1.jobTitle="SDET 2";
        System.out.println("cont1.calculateSalary(67) = " + cont1.calculateSalary(67));


    }
}
