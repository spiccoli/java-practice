package model;

// Clase TrianguloRectangulo que extiende Figura
public class TrianguloRectangulo extends Figura {
    private double base;
    private double altura;

    public TrianguloRectangulo(int x, int y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    // Getters y setters
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return base*altura;
    }
    @Override
    public double calcularPerimetro() {
        return base;//FALTA IMPLEMENTAR
    }
}