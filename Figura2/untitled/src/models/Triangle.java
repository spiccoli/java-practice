package models;

public class Triangle extends Shape{

    private int lado;
    public int getLado(){return lado;}
    public void setLado(int lado){this.lado = lado;}

    public Triangle(int lado) {
        this.lado = lado;
    }

    @Override
    int area() {return (lado*lado)/2;}
    @Override
    int perimeter() {return lado * 3;}
}