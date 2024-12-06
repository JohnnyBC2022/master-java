/*
Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99),
por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.
 */

import java.util.Scanner;

public class Tarea14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] numeros = new int[7];

        System.out.println("Escribe 7 números enteros del 11 al 99:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = s.nextInt();
        }

        int max = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }

        System.out.println("El número más alto es: " + max);
    }
}

/*
Ejemplo del instructor:

import java.util.Scanner;

public class ProgramaImprimirMasAlto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];

        // ingresamos los datos por ejemplo {14, 33, 15, 36, 78, 21, 43}
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese un numero de 11 a 99: ");
            arreglo[i] = scanner.nextInt();
        }

        int max = 0;

        // luego obtenemos el valor mayor
        for (int i = 0; i < 7; i++) {
            max = (max > arreglo[i])? max: arreglo[i];
        }
        System.out.println("El valor mas alto es: " + max);
    }
}
 */
