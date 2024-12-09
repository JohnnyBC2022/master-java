public class EjemploMatricesBuscar {
    public static void main(String[] args) {

        int[][] matrizdeEnteros = {
                {35, 90, 3, 1978},
                {15, 2020, 10, 5},
                {677, 127, 32767, 1999},
        };

        int elementoABuscar = 15;
        boolean encontrado = false;

        int i;
        int j = 0;
        buscar:
        for (i = 0; i < matrizdeEnteros.length; i++) {
            for (j = 0; j < matrizdeEnteros[i].length; j++) {
                if (matrizdeEnteros[i][j] == elementoABuscar) {
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if (encontrado) {
            System.out.println("Encontrado " + elementoABuscar + " en la fila: " + i + ",columna: " + j);
        } else {
            System.out.println(elementoABuscar + "no encontrado.");
        }
    }
}
