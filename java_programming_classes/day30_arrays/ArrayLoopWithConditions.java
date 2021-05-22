package java_programming_classes.day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String [] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Brazil", "Portugal", "China", "Philippines", "Philippines", "China", "Philippines", "China", "Armenia", "Philippines", "China", "Colombia", "Philippines", "Honduras", "Indonesia", "Brazil", "China", "United States", "Russia"};
        //print all numbers that > 100
        System.out.println("-----prices more than 100-------");
        for(double eachPrice : prices) {
            if (eachPrice > 100) { //optional {}
                System.out.print(eachPrice + " ");
            }
        }
        System.out.println("\n----- prices between 10 and 70 -----");
        for(double eachPrice : prices){
            if(eachPrice>=10 && eachPrice<=70){
                System.out.print(eachPrice+", ");
            }
        }
        System.out.println("\n------------count of the prices are more than 50-----------");
        int count = 0;
        for(double n : prices){
            if(n>=50){
                count++;
            }
        }                System.out.print(count);
        System.out.println("\n-------countries with name length more than 7 - inclusive -----");
        for(String eachCountry : countries){
            if(eachCountry.length()>=7){
                System.out.print(eachCountry + " ");
            }
        }

    }
}
