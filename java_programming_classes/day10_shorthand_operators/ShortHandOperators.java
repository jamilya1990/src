package java_programming_classes.day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars = " + cars);
        cars = cars + 2;
        System.out.println("cars = " + cars);
        cars += 5;
        System.out.println("cars = " + cars);
        cars -= 6;
        System.out.println("cars = " + cars);
        cars = cars - 1;
        System.out.println("cars = " + cars);
        cars -= 1;
        System.out.println("cars = " + cars);
        int electricCars = 13;
        //cars = cars + electricCars;
        cars += electricCars;
        System.out.println("cars = " + cars);

        String word = "java";
        System.out.println("word = " + word);
        word = word + " programming";
        System.out.println("word = " + word);
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but selenium is more fun!";
        //word = word + selenium;
        word += selenium;
        System.out.println("word = " + word);

        word += 12345;
        System.out.println("word = " + word);

        char letter = 'a';
        System.out.println("letter = " + letter);
        letter += 3;
        //letter = letter + 3; ---> not allowed, only shorthand assignment
        System.out.println("letter = " + letter);
        letter += 'J';
        System.out.println("letter = " + letter); //char add number and takes result from ASCII table

        /* word += letter;
        System.out.println("word = " + word);*/
        letter += 123;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("parkingFee = " + parkingFee);
        parkingFee /= 2;
        System.out.println("50 % discount for parkingFee = " + parkingFee);
        // weekent free;
        parkingFee -= parkingFee;
        System.out.println("parkingFee = " + parkingFee);
    }
}
