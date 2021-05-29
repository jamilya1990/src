package java_programming_classes.day48_constructors_static;

public class Customer {
    private String name;
    private int id;

    //no-args constructor:
    public Customer(){

        name = "new name";
        id = -1;
    }
    public Customer(String name, int id){
        System.out.println("2 args constructor:");
        this.name = name;
        this.id = id;

        //System.out.println("New Customer: name - "+setName(name)+""+setId(id));
    }

    @Override
    public String toString() {
        return "Customer{" + "name='" + name + '\'' + ", id=" + id + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
