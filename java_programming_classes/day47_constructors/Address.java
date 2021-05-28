package java_programming_classes.day47_constructors;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
//constructor - automatically called. Special method, doesn't have return type, Same name as a class name
    public Address(){
        System.out.println("Address constructor");
    }
    //second constructor, overloaded constructor ->provides shortcut to initialized variables

    public Address(String street, String city, String state, String zipCode, String country){
        this.street=street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(country.equalsIgnoreCase("usa")){
            this.country = "USA";
        }else{
            System.out.println("ERROR: Country can be USA only!");
        }

    }

    @Override
    public String toString() {
        return "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'';
    }
}
