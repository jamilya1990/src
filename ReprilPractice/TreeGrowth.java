package ReprilPractice;

public class TreeGrowth {
    public static void main(String[] args) {
        //int growLength = 1;
        //int year = 1;
        int treeSize = 0;
        for(int year = 1; year<=10; year++){
            //int treeSize = growLength*year;
            if(year>=1 && year <=3){
                //growLength = 1;

                System.out.println("Year " + year + " - growth 1 cm");
                treeSize += 1;
                System.out.println("tree size: " + treeSize);
            } else if (year>3 && year <=10){
                //growLength =2;

                System.out.println("Year " + year + " - growth 2 cm");
                treeSize += 2;
                System.out.println("tree size: " + treeSize);
            }
        }
    }
}
