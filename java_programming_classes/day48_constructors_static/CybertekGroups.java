package java_programming_classes.day48_constructors_static;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
        Group group1 = new Group("TMS");
        System.out.println("group1.getMembers().size() = " + group1.getMembers().size());
        group1.addMember("Ab");
        group1.addMember("Bc");
        group1.addMember("Cd");

        Group group2 = new Group("ESS");
        group2.setMembers(Arrays.asList("De", "Ef", "Fg", "Gh"));
        System.out.println(group2.getMembers().size());
        if(group2.getMembers().contains("Fg")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

}
