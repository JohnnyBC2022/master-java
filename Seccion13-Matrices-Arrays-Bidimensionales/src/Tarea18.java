/*

Escribir un programa que imprima una X construida a base de la letra X en las diagonales de la matriz y utilizar el carácter guion bajo como relleno. El tamaño de la x se basa en una variable n que indicará el tamaño de la letra para imprimir en una matriz de n x n.

El carácter "X" en mayúscula y el guion bajo "_" para los espacios.

Por ejemplo para n=5 se obtiene:

X___X
_X_X_
__X__
_X_X_
X___X
Por ejemplo para n=6 se obtiene:

X____X
_X__X_
__XX__
__XX__
_X__X_
X____X
Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.

 */

import java.util.Scanner;

public class Tarea18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce el tamaño de la matriz (n): ");
        int n = s.nextInt();

        if (n == 0) {
            System.out.println("ERROR");
            return;
        }

        String[][] matriz = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) { // El instructor usa j == n - i - 1 (quizás sea más fácil de entender)
                    matriz[i][j] = "X";
                } else {
                    matriz[i][j] = "_";
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
