public class SquareClass {



    double length;
    double width;

    public double calcArea() {

        return length  * width;
    }

    public double calcDiagonal() {

        return Math.sqrt ( Math.pow(length, 2)  + Math.pow( width,2));
    }
}
