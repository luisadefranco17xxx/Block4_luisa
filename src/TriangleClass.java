public class TriangleClass {
    double length;
    double height;

    double side_a;
    double side_b;
    double side_c;

    public double calcArea() {

        return length  * height/2;
    }

    public double calcPerimeter() {

        return side_a+side_b+side_c;
    }

}
