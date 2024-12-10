package model;

class Circulo extends Figura {
    double radio;

    // Constructor
    Circulo(int x, int y, double radio) {
        super(x,y);
        this.radio = radio;
    }
    // Getter para radio
    public double getRadio() {
        return radio;
    }
    // Setter para radio
    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
