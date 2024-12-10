package models;

public class Square extends Shape{

    private int lado;
    public int getLado(){return lado;}
    public void setLado(int lado){this.lado = lado;}

    public Square(int lado) {
        this.lado = lado;
    }

    @Override
    int area() {return lado*lado;}
    @Override
    int perimeter() {return lado * 4;}
}
