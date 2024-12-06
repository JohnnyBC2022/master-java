/*
Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9).
Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo
y también imprimir la cantidad de veces que aparece en el arreglo.

Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}

Como resultado debería imprimir lo siguiente:

La mayor concurrencia es: 3
El elemento que más se repite es: 5
En el ejemplo, el elemento que más se repite en el arreglo es el número 5
con una ocurrencia de 3 veces.

 */

import java.util.Scanner;

public class Tarea16 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = s.nextInt();
        }

        int maxOcurrencias = 0;
        int numeroMasRepetido = 0;

        for (int i = 0; i < numeros.length; i++) {
            int ocurrencias = 0;

            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    ocurrencias++;
                }
            }

            if (ocurrencias > maxOcurrencias) {
                maxOcurrencias = ocurrencias;
                numeroMasRepetido = numeros[i];
            }
        }

        System.out.println("La mayor ocurrencia es: " + maxOcurrencias);
        System.out.println("El elemento que más se repite es: " + numeroMasRepetido);
    }
}
