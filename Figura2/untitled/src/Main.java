import models.*;

public class Main {
    public static void main(String[] args) {
        final int DECIMAL_PLACES = 2;
        System.out.println("---------------");

        // Create and display information for RightTriangle
        RightTriangle myTriangle = new RightTriangle(4, 5);
        System.out.printf("The area of the triangle is: %." + DECIMAL_PLACES + "f%n", myTriangle.area());
        System.out.printf("The perimeter of the triangle is: %." + DECIMAL_PLACES + "f%n", myTriangle.perimeter());

        // Create and display information for Square
        Square mySquare = new Square(5);
        System.out.printf("The area of the square is: %." + DECIMAL_PLACES + "f%n", mySquare.area());
        System.out.printf("The perimeter of the square is: %." + DECIMAL_PLACES + "f%n", mySquare.perimeter());

        // Create and display information for Circle
        Circle myCircle = new Circle(5);
        System.out.printf("The area of the circle is: %." + DECIMAL_PLACES + "f%n", myCircle.area());
        System.out.printf("The perimeter of the circle is: %." + DECIMAL_PLACES + "f%n", myCircle.perimeter());
    }
}
