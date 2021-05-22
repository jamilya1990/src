package java_programming_classes.day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i = " + i);

        int linesOfCode = 15;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode++;
        ++linesOfCode;
        linesOfCode += 1;
        linesOfCode = linesOfCode + 1;
        System.out.println("linesOfCode = " + linesOfCode);

        linesOfCode--; //POST-DECREMENT
        --linesOfCode; //PRE-DECREMENT
        linesOfCode = linesOfCode -1;
        linesOfCode -= 1;
        System.out.println("linesOfCode = " + linesOfCode);

        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        ++letter;
        System.out.println("letter = " + letter);
        letter +=27;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);
    }
}
