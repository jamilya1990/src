package java_programming_classes.day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address();//calling the constructor automatically
        cybertekAddress.setStreet("7925 Jones branch dr");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");
        cybertekAddress.setCountry("usa");
        System.out.println("Cybertek school address: " + cybertekAddress.toString());

        Address newAddress = new Address();
        System.out.println(newAddress);

        Address myAddress = new Address("454 Winter", "Antelope", "CA", "89000", "USA");
        System.out.println("myAddress = " + myAddress);
    }
}
