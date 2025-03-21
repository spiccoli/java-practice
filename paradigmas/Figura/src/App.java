import model.*;

public class App{
    public static void main(String[] args){
    Cuadrado cuadrado1 = new Cuadrado(0,0,4);
    System.out.println("X: " + cuadrado1.getX());
    System.out.println("Y: " + cuadrado1.getY());
    System.out.println("Valor de lado: " + cuadrado1.getLado());
    System.out.println("Area" + cuadrado1.calcularArea());
    System.out.println("Perimetro" + cuadrado1.calcularPerimetro());

    }
}
//CONCEPTOS

//DOBLE DISPATCHER
//REFLECTION
//LISTA ENLAZADA

//OOP ABSTRACTION ENCAPSULAMIENTO MODULARIDAD(PAQUETES EN JAVA) JERARQUIA(HERENCIA) -> CLASES ABSTRACTAS E INTERFACES

// generar 3 subclases
// Triangulo rectangulo
// rectangulo
// circulo
