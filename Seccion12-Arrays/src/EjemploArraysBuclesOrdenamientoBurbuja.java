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

    public static void main(String[] args) {

        String[] productos = {"Pendrive 64GB", "Teléfono Móvil", "Disco Duro SSD 256 GB", "Ordenador Portátil"};

        int total = productos.length;

        int contador = 0;
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                if (productos[i].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);

        // De forma más optimizada:
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (productos[j + 1].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = auxiliar;
                }
                contador++;
            }
        }

        // Arrays.sort(productos);
        // arrayInverso(productos);

        // Collections.reverse(Arrays.asList(productos));
//        System.out.println("--- Usando for ---");
//        for (int i = 0; i < total; i++) {
//            System.out.println("para el índice = " + i + " : " + productos[i]);
//        }


        System.out.println("--- Usando for inverso mutable---");
        for (int i = 0; i < total; i++) {
            System.out.println("para el índice = " + i + " : " + productos[i]);
        }
    }
}
