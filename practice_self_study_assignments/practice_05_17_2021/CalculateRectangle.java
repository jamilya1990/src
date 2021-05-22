package practice_self_study_assignments.practice_05_17_2021;

public class CalculateRectangle {
    public static void main(String[] args) {
        Rectangle areaTest = new Rectangle();
        areaTest.setDimensions(10.0, 20.0);
        System.out.println(areaTest.getArea());
        System.out.println("areaTest.toString() = " + areaTest.toString());
        System.out.println("areaTest = " + areaTest);//when we have method override toString(), we can just print object

    }
}
