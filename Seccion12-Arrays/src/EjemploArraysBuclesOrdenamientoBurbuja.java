import java.util.Arrays;

public class EjemploArraysBuclesOrdenamientoBurbuja {

    public static void arrayInverso(String[] array) {
        int total = array.length;
        int total2 = array.length;
        for (int i = 0; i < total2; i++) {
            String actual = array[i];
            String inverso = array[total - 1 - i];
            array[i] = inverso;
            array[total - 1 - i] = actual;
            total2--;
        }
    }

    public static void sortBurbuja(Object[] array){
        int total = array.length;
        int contador = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if ( ((Comparable)array[j + 1]).compareTo(array[j]) < 0) {
                    Object auxiliar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }

    public static void main(String[] args) {

        String[] productos = {"Pendrive 64GB", "Teléfono Móvil", "Disco Duro SSD 256 GB", "Ordenador Portátil"};

//        int total = productos.length;
//        for (int i = 0; i < total; i++) {
//            for (int j = 0; j < total; j++) {
//                if (productos[i].compareTo(productos[j]) < 0) {
//                    String auxiliar = productos[i];
//                    productos[i] = productos[j];
//                    productos[j] = auxiliar;
//                }
//                contador++;
//            }
//        }
        sortBurbuja(productos);

        // De forma más optimizada:
//        for (int i = 0; i < total - 1; i++) {
//            for (int j = 0; j < total - 1 - i; j++) {
//                if (productos[j + 1].compareTo(productos[j]) < 0) {
//                    String auxiliar = productos[j];
//                    productos[j] = productos[j + 1];
//                    productos[j + 1] = auxiliar;
//                }
//                contador++;
//            }
//        }

        Integer[] numeros = new Integer[4]; // instanciación del array (el valor por defecto de un entero es 0)

        numeros[0] = 1; // inicialización
        numeros[1] = Integer.valueOf("2");
        numeros[2] = (int) 3L;
        numeros[3] = 4;


    sortBurbuja(numeros);
        for (int i =0; i < numeros.length; i++) {
            System.out.println("i = " + i + " : " + numeros[i]);
        }
    }
}
