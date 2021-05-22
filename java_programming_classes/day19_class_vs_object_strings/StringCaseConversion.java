package java_programming_classes.day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        // convert to lower case
        System.out.println(word.toLowerCase());
        System.out.println("Java".toLowerCase());
        word.toLowerCase();
        System.out.println(word);
        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);

        //change word to all lowercase letters and assign back
        word = word.toLowerCase();
        System.out.println("word = " + word);
        
        
        String company = "Amazon";
        System.out.println("company.toUpperCase() = " + company.toUpperCase());
        System.out.println("java".toUpperCase());

        //change company "Amazon" to "AMAZON
        company = company.toUpperCase();
        System.out.println("company = " + company);
    }
}
