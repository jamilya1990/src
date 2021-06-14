package java_programming_classes.day52_inheritance.discord_users;

public class Admin extends User{

    @Override
    public String toString(){
        return "User role = "+getRole()+", Username = "+getName()+", User ID = "+getId();
    }

   public Admin(){
       super();
       System.out.println("Constructor of Admin class");
    }

    public Admin (String name, int id){
        super("Admin", name, id);
        System.out.println("Admin class 2 args constructor");
    }

}
