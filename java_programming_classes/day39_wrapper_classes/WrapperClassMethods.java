package java_programming_classes.day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50, 23));
        System.out.println(Integer.min(9493, 2132));
        System.out.println("Min Int: " + Integer.MIN_VALUE); //what is the smallest possile integer
        System.out.println("Max Int: " + Integer.MAX_VALUE);

        System.out.println(Double.max(6473.32, -213.32));
        System.out.println(Double.MAX_VALUE);

        System.out.println(Double.compare(5, 34));//compare can return 3 values : negative, 0 and positive
        System.out.println(Character.isDigit('4'));
        System.out.println(Character.isDigit('V'));
        System.out.println(Character.isAlphabetic('A'));
        System.out.println(Character.isLetter('r'));
        System.out.println(Character.isUpperCase('u'));

        char letter = 'A';
        if(Character.isUpperCase(letter)){
            System.out.println("it is upper case");
        }
        String word = "JaVa iS FuN";
        String upper = "";
        for (int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))){
                upper+=word.charAt(i)+"";
            }
        }
        System.out.println(upper);
    }
}
