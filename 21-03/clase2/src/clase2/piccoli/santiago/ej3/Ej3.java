//Realizar un programa que solicite por consola el ingreso de dos números.
//        Se debe calcular la suma, resta, multiplicación y división entre los dos números, en el orden ingresado.
//        Se deben mostrar por pantalla los resultados indicando a que operación corresponden.
//        Se requiere realizar cada cálculo en una función que reciba los numeros por parámetro y devuelva el resultado.
//        Se requiere mostrar los resultados por consola en una función que reciba los resultados por parámetro y los muestre junto al mensaje.

package clase2.piccoli.santiago.ej3;
import java.util.Scanner;

public class Ej3 {

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public static double division(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("No se pudo dividir por 0");
        }
        return (double) num1 / num2;
    }

    public static void mostrarResultadosParcial(int suma, int resta, int multiplicacion) {
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
    }

    public static void mostrarResultados(int suma, int resta, int multiplicacion, double division) {
        mostrarResultadosParcial(suma, resta, multiplicacion);
        System.out.println("Division: " + division);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numero 1:");
        int num1 = sc.nextInt();
        System.out.println("Ingresar numero 2:");
        int num2 = sc.nextInt();

        int sumaResult = suma(num1, num2);
        int restaResult = resta(num1, num2);
        int multiplicacionResult = multiplicacion(num1, num2);

        try {
            double divisionResult = division(num1, num2);
            mostrarResultados(sumaResult, restaResult, multiplicacionResult, divisionResult);
        } catch (ArithmeticException e) {
            mostrarResultadosParcial(sumaResult, restaResult, multiplicacionResult);
            System.out.println(e.getMessage());
        }
    }
}
