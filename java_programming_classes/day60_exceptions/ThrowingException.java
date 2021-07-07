package java_programming_classes.day60_exceptions;

public class ThrowingException {

    public static void main(String[] args) throws Exception {

        System.out.println("Lets create exceptions");
//        RuntimeException e = new RuntimeException();
//        throw e;

//        throw new Exception();

        String name = "";
        if (name.isEmpty()){
            throw new RuntimeException("Name cannot be empty");
        }

        //Assert.fail("message) - will throw exception

    }
}
