import java.util.Arrays;
import java.util.Collections;

public class EjemploArraysBuclesInversoMutable {

    public static void arrayInverso(String[] array){
        int total = array.length;
        int total2 = array.length;
        for (int i = 0; i < total2; i++) {
            String actual = array[i];
            String inverso = array[total-1-i];
            array[i] = inverso;
            array[total-1-i] = actual;
            total2--;
        }
    }
    public static void main(String[] args) {

        String[] productos = {"Pendrive 64GB", "Teléfono Móvil", "Disco Duro SSD 256 GB", "Ordenador Portátil"};

        int total = productos.length;

        Arrays.sort(productos);
        arrayInverso(productos);

        // Collections.reverse(Arrays.asList(productos));
        System.out.println("--- Usando for ---");
        for (int i = 0; i < total; i++) {
            System.out.println("para el índice = " + i + " : " + productos[i]);
        }





        System.out.println("--- Usando for inverso mutable---");
        for (int i = 0; i < total; i++) {
            System.out.println("para el índice = " + i + " : " + productos[i]);
        }
    }
}
