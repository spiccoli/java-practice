//Realizar un programa que muestre por consola todos los números multiplos de 2 y múltiplos de 4 comprendidos entre el 0 y 40.
package clase2.piccoli.santiago.ej2;

public class Ej2 {
    public static void main(String[] args) {
        System.out.println("\nTodos los multiplos de 2: ");
        for (int i = 0; i < 40; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println("\nTodos los numeros multiplos de 4: ");
        for (int i = 0; i < 40; i++) {
            if (i % 4 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
