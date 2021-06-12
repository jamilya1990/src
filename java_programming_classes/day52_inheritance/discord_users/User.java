package java_programming_classes.day52_inheritance.discord_users;

public class User {
    private String role;

    public User(String role, String name, int id) {
        this.role = role;
        this.name = name;
        this.id = id;
    }

    private String name;
    private int id;

    public User(){
        System.out.println("Constructor");
    }


    public void setRole(String role){
        this.role=role;
    }
    public String getRole(){
        return role;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }

    @Override
    public String toString(){
        return "User role = "+role+", Username = "+name+", User ID = "+id;
    }
}
