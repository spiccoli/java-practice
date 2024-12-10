import models.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------");
        RightTriangle myTriangle = new RightTriangle(4, 5);
        System.out.printf("The area of the triangle is: %.2f%n", myTriangle.area());
        System.out.printf("The perimeter of the triangle is: %.2f%n", myTriangle.perimeter());
        Square mySquare = new Square(5);
        System.out.printf("The area of the square is: %.2f%n", mySquare.area());
        System.out.printf("The perimeter of the square is: %.2f%n", mySquare.perimeter());
        Circle myCircle = new Circle(5);
        System.out.printf("The area of the circle is: %.2f%n", myCircle.area());
        System.out.printf("The perimeter of the circle is: %.2f%n", myCircle.perimeter());
    }
}