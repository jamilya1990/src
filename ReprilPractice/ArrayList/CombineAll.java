package ReprilPractice.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineAll {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        System.out.println(combineAL(num1, num2));
    }
    public static ArrayList<Integer> combineAL(ArrayList<Integer> numberOne, ArrayList<Integer> numberTwo){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0; i<numberOne.size(); i++){
            numbers.add(i, numberOne.get(i));
            if(i+1==numberOne.size()){
                for(int j=0; j<numberTwo.size(); j++) {
                    numbers.add((j + numberOne.size()), numberTwo.get(j));
                }
            }
        }
        return numbers;
    }
}
