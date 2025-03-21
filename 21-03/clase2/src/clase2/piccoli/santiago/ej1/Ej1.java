package clase2.piccoli.santiago.ej1;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero 1");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el numero 2");
        int numero2 = sc.nextInt();
        System.out.println("La suma de los numeros es: "+(numero1+numero2));
    }
}
