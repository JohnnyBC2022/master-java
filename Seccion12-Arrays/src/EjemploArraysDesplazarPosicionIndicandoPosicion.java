import java.util.Scanner;

public class EjemploArraysDesplazarPosicionIndicandoPosicion {
    public static void main(String[] args) {

        int[] a = new int[10];
        int elemento, posicion;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Introduzca un número: ");
            a[i] = s.nextInt();
        }

        System.out.println();
        System.out.println("Nuevo número:");
        elemento = s.nextInt();

        System.out.println("Indica la posición donde lo quieres insertar (de 0 a 9): ");
        posicion = s.nextInt();


        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }

        a[posicion] = elemento;

        System.out.println("El array ahora es: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
