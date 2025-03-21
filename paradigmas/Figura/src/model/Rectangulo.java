package model;

public class Rectangulo extends Figura {
    private double longitud;
    private double anchura;

    public Rectangulo(int x, int y, int longitud, int anchura) {
        super(x, y);
        this.longitud = longitud;
        this.anchura = anchura;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    @Override
    public double calcularArea() {
        return longitud * anchura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (longitud + anchura);
    }

}