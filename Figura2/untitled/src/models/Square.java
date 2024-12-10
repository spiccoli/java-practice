package models;

public class Square extends Shape {
    private double side;

    public Square(double side){this.side = side;}

    public double getSide(){
        return side;
    }
    public void setSide(double side){
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be positive.");
        }
        this.side = side;
    }

    @Override
    public double area(){return side * side;};
    @Override
    public double perimeter(){return side * 4;};
}