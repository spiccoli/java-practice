package model;

public class Cuadrado extends Figura {

    private int lado;
    //getter and setter del lado
    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }

    //constructor
    public Cuadrado(int x, int y, int lado) {
        super(x, y);
        this.lado = lado;
    }

    // metodos
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }
}
