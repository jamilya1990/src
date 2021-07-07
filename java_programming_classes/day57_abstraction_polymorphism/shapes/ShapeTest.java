package java_programming_classes.day57_abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        //Create list of shapes and store different shapes
        List<Shape> listOfShapes = new ArrayList<>();
        listOfShapes.add(new Square());
        listOfShapes.add(new Circle());
        listOfShapes.add(new Triangle());
        for (Shape each : listOfShapes) {
            each.draw();
        }
    }
}
