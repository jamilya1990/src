package java_programming_classes.day39_wrapper_classes;

public class IQHowToCOnvertStringIntoNumber {
    public static void main(String[] args) {
        //we can use parse or valueOf methods in wrapper classes.

        //String into int:
        String total = "12345";
        int count = Integer.parseInt(total);
        // or
        int num = Integer.parseInt("8382");
        if(count>123456){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        String strPrice = "123.98";
        double price = Double.parseDouble(strPrice);

    }
}