import java.util.Arrays;

public class EjemploArraysBucles {
    public static void main(String[] args) {

        String[] productos = new String[4];

        int total = productos.length;

        productos[0] = "Pendrive 64GB";
        productos[1] = "Teléfono Móvil";
        productos[2] = "Disco Duro SSD 256 GB";
        productos[3] = "Ordenador Portátil";

        Arrays.sort(productos);

        System.out.println("--- Usando for ---");
        for (int i = 0; i < total; i++) {
            System.out.println("para el índice = " + i + " : " + productos[i]);
        }

        System.out.println("--- Usando foreach ---");
        for (String prod : productos) {
            System.out.println("prod = " + prod);
        }

        System.out.println("--- Usando while ---");
        int i = 0;
        while (i < total) {
            System.out.println("para el índice = " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("--- Usando do while ---");
        int j = 0;
        do {
            System.out.println("para el índice = " + j + " : " + productos[j]);
            j++;
        } while (j < total);

        int[] numeros = new int[10];

        int totalNum = numeros.length;
        for (int k = 0; k < totalNum; k++) {
            numeros[k] = k * 3;
        }
        for (int k = 0; k < totalNum; k++) {
            System.out.println("numeros = " + numeros[k]);
        }
    }
}
