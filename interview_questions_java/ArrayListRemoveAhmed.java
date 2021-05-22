package interview_questions_java;

public class ArrayListRemoveAhmed {
    public static void main(String[] args) {
        //Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
        //Write a java operation to remove all the names named Ahmed
        //List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(removeAhmed("Ahmed, John, Eric, Ahmed"));
    }
    public static String removeAhmed(String str){

        String[] names = str.split(", ");
        int count = 0;
        for(String i:names){
            if(i.equals("Ahmed")){
                count++;
            }
        }
        String[] list = new String[names.length-count];
        int index = 0;
        for (int i = 0; i < names.length; i++) {
            if(!names[i].equals("Ahmed")){
                list[index] = names[i];
                index++;
            }
        }
        //System.out.println(String.join(", ", list));
        return String.join(", ", list);
    }
}
