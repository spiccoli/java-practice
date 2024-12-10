package model;

public abstract class Figura { // NO SE VA A INSTANCIAR Y PUEDO CREAR METODOS CONCRETOS (X Y) DEPENDEN DE LA FIGURA, PROPIOS
    // ABSTRACTA PURA TODOS LOS METODOS TIENEN QUE SER INSTANCIADAS POR SUS CLASES HIJAS

    //Encapsulamiento: Ocultamiento de los detalles de la implementacion
    //ATRIBUTOS PRIVADOS Y USANDO GET SET

    private int x;
    private int y;
    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public abstract double calcularArea(); // toda figura tendra su metodo, debera decir como se hace en especifico
    public abstract double calcularPerimetro();

}
