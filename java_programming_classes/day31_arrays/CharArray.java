package java_programming_classes.day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        for(char each : letters){
            System.out.print(each);
        }
        String sentence = new String(letters); //converted char array into String
        System.out.println("\n" + sentence);

        //print String to char Array
        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length() = " + item.length());

        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "Strawberry"};
        String fruitStr = "";
        for(String each: fruits){
            fruitStr +=each + "-";
            //System.out.print(each + "-");
        }
        System.out.println("\nfruitStr = " + fruitStr);

        String[] languages = {"java", "C++", "Ruby", "sql", "python", "javascript"};
        System.out.println(String.join("|", languages));
        System.out.println(String.join("#", languages));
        String joinedLanguages = String.join(" <> ", languages);
        System.out.println("joinedLanguages = " + joinedLanguages);
    }
}
