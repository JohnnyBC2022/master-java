/*

Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio
de los números positivos, el promedio de los negativos y contar el número de ceros.

 */

import java.util.Scanner;

public class Tarea15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int sumaPositivos = 0, sumaNegativos = 0, contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;

        for (int numero : numeros) {
            if (numero > 0) {
                sumaPositivos += numero;
                contadorPositivos++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        double promedioPositivos = (contadorPositivos > 0) ? (double) sumaPositivos / contadorPositivos : 0;
        double promedioNegativos = (contadorNegativos > 0) ? (double) sumaNegativos / contadorNegativos : 0;

        System.out.println("Promedio de los números positivos: " + promedioPositivos);
        System.out.println("Promedio de los números negativos: " + promedioNegativos);
        System.out.println("Cantidad de ceros: " + contadorCeros);
    }
}


/*
Ejemplo del instructor:

import java.util.Scanner;

public class SistemaEstadisticoArreglo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumaPos, contPos, sumaNeg, contNeg, contCero, i, arreglo[];

        arreglo = new int[7];
        sumaPos = 0;
        contPos = 0;
        sumaNeg = 0;
        contNeg = 0;
        contCero = 0;

        // utilizamos un for para leer los datos del teclado y llenar el arreglo
        for (i = 0; i < 7; i++) {
            System.out.println("Ingrese un numero: ");
            arreglo[i] = scanner.nextInt();
        }

        // utilizamos otro for para realizar los cálculos de contador y sumas
        for (i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == 0) {
                contCero++;
            } else {
                if (arreglo[i] > 0) {
                    sumaPos = sumaPos + arreglo[i];
                    contPos++;
                } else {
                    sumaNeg = sumaNeg + arreglo[i];
                    contNeg++;
                }
            }
        }

        if (contPos == 0) {
            System.out.println("No se pudo calcular el promedio de números positivos");
        } else {
            System.out.println("El promedio de los positivos: " + (float) sumaPos / contPos);
        }

        if (contNeg == 0) {
            System.out.println("No se pudo realizar el promedio de números negativos");
        } else {
            System.out.println("El promedio de los negativos: " + (float) sumaNeg / contNeg);
        }

        System.out.println("La cantidad de cero es de: " + contCero);

    }
}

 */