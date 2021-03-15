public class BeispieleClassen {
    public static void main(String[] args) {

        SquareClass my_square= new SquareClass();

        my_square.length =9.0;
        my_square.width =9.0;
        System.out.println( my_square.calcDiagonal());
        System.out.println(my_square.calcArea());

        TriangleClass my_triangle = new TriangleClass();

        my_triangle.side_a=0.1;



    }
}
