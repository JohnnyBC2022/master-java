public class EjemploMatricesSimetrica {
    public static void main(String[] args) {

        boolean simetrica = true;
        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };

        int i, j;
        i = 0;
        System.out.println("Iterando con bucle while: ");
        salir:
        while (i < matriz.length) {
            j = 0;
            while (j < i) { // no necesitamos recorrer toda la matriz, ya que basta con comprobar la matriz inferior
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break salir;
                }
                j++;
            }
            i++;
        }

        if (simetrica) {
            System.out.println("La matriz es simétrica");
        } else {
            System.out.println("La matriz no es simétrica");
        }

        System.out.println("Iterando con bucle for: ");

        salir:
        for (int l = 0; l < matriz.length; l++) {
            for (int m = 0; m < l; m++) {
                if (matriz[l][m] != matriz[m][l]) {
                    simetrica = false;
                    break salir;
                }
            }
        }

        if (simetrica) {
            System.out.println("La matriz es simétrica");
        } else {
            System.out.println("La matriz no es simétrica");
        }
    }
}
