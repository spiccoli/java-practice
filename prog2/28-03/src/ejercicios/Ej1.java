package ejercicios;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        String[] data = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        data[0] = sc.nextLine();
        System.out.println("Ingrese el apellido");
        data[1] = sc.nextLine();
        System.out.println("Ingrese el dni");
        data[2] = sc.nextLine();

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + " ");
        }
    }
}
