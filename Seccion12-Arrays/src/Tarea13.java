/*
 Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
 Luego debemos mostrarlos en el siguiente orden:
 el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente.
 */

import java.util.Scanner;

public class Tarea13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Escribe 10 números enteros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = s.nextInt();
        }

        System.out.println("Los números en el orden solicitado son:");

        for (int i = numeros.length - 1, j = 0; i>=0 && j < numeros.length; i--, j++ ){
            if(i!=j){
                System.out.println(numeros[i] + " ");
                System.out.println(numeros[j] + " ");
            } else {
                System.out.println(numeros[i]);
            }
        }
    }
}

/*
Ejemplo del instructor:

import java.util.Scanner;

public class ProgramaOrdenarArreglo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i, arreglo[];
        arreglo = new int[10];
        for (i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            arreglo[i] = scanner.nextInt();
        }

        // como en cada iteración del for se muestran dos números
        // solo necesitaremos recorrer la mitad de iteraciones, con eso es suficiente.
        System.out.println("El resultado es:");
        for (i = 0; i <= 4; i++) {
            System.out.println(arreglo[9 - i]); // y el i-ésimo por el final
            System.out.println(arreglo[i]); // mostramos el i-ésimo número por el principio
        }
    }
}
 */
