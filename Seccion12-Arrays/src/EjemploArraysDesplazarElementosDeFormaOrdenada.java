import java.util.Scanner;

public class EjemploArraysDesplazarElementosDeFormaOrdenada {
    public static void main(String[] args) {

        int[] a = new int[7];
        int numero, posicion;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Introduzca un número: ");
            a[i] = s.nextInt();
        }

        System.out.println();

        System.out.println("Introduzca el número a insertar");
        numero = s.nextInt();

        posicion = 0;

        while (posicion < 6 && numero > a[posicion]) {
            posicion++;
        }

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }

        a[posicion] = numero;
        System.out.println("El array ahora es: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " => " + a[i]);
        }
    }
}
