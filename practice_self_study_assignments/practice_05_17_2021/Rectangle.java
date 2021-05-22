package practice_self_study_assignments.practice_05_17_2021;

public class Rectangle {
    /**Create a class Rectangle
     *  -
     *     Create these variables in the class: width, height, area(all double)
     *     -Create these methods (non-static):
     *          -setDimensions()
     *              -parameters: width, height (Do not name the parameters the same as your class variable names)
     *              -return: void
     *              -action: assigns the width and height of the object given from the parameters.
     *              Also calculate the area of the rectangle in the method and store to the area variable.
     *              (area = width * height)
     *              -getArea()-parameters: none
     *              -return: int
     *              -action: returns the area variable
     *          -toString() generate the toString method as shown in class.
     *          See Murodil_only for screenshots of steps-Create a class RectangleObjects
     *     -Create Rectangle objects, call the setDimensions and getArea methods of the objects
     */
    double width, height, area;

    public void setDimensions(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + area +
                '}';
    }

    public double getArea(){
        area = width*height;
        return area;

    }
   }
