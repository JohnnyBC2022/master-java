import java.util.Scanner;

public class EjemploArraysParesImpares {
    public static void main(String[] args) {

        int[] a, pares, impares;
        int totalPares = 0, totalImpares = 0;
        a = new int[10];

        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca 10 números enteros: ");

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }
        pares = new int[totalPares];
        impares = new int[totalImpares];

        int auxPares = 0;
        int auxImpares = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                pares[auxPares++] = a[i];
            } else {
                impares[auxImpares++] = a[i];
            }
        }

        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\r\nImpares");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();
    }
}
