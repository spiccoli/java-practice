package models;

public class RightTriangle extends Shape {

    // ATTRIBUTES
    private double leg1;
    private double leg2;
    private double hypotenuse;

    // CONSTRUCTOR
    public RightTriangle(double leg1, double leg2) {
        if (leg1 <= 0 || leg2 <= 0) {
            throw new IllegalArgumentException("Leg lengths and hypotenuse must be positive.");
        }
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.hypotenuse = Math.sqrt(leg1 * leg1 + leg2 * leg2);
    }

    // GETTERS AND SETTERS
    public double getLeg1() {
        return leg1;
    }

    public void setLeg1(double leg1) {
        if (leg1 <= 0) {
            throw new IllegalArgumentException("Leg length must be positive.");
        }
        this.leg1 = leg1;
    }

    public double getLeg2() {
        return leg2;
    }

    public void setLeg2(double leg2) {
        if (leg2 <= 0) {
            throw new IllegalArgumentException("Leg length must be positive.");
        }
        this.leg2 = leg2;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        if (hypotenuse <= 0) {
            throw new IllegalArgumentException("Hypotenuse length must be positive.");
        }
        this.hypotenuse = hypotenuse;
    }

    // METHODS
    @Override
    public double area() {
        return leg1 * leg2 / 2;
    }

    @Override
    public double perimeter() {
        return leg1 + leg2 + hypotenuse;
    }
}
