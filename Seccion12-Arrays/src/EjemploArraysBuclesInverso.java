import java.util.Arrays;

public class EjemploArraysBuclesInverso {
    public static void main(String[] args) {

        //String[] productos = new String[4];
        String[] productos = {"Pendrive 64GB", "Teléfono Móvil", "Disco Duro SSD 256 GB", "Ordenador Portátil"};

        int total = productos.length;

        //  productos[0] = "Pendrive 64GB";
        //  productos[1] = "Teléfono Móvil";
        //  productos[2] = "Disco Duro SSD 256 GB";
        //  productos[3] = "Ordenador Portátil";

        Arrays.sort(productos);

        System.out.println("--- Usando for ---");
        for (int i = 0; i < total; i++) {
            System.out.println("para el índice = " + i + " : " + productos[i]);
        }

        System.out.println("--- Usando for inverso---");
        for (int i = 0; i < total; i++) {
            System.out.println("para el índice = " + (total - 1 - i) + " : " + productos[total - 1 - i]);
        }

        System.out.println("--- Usando for inverso 2---");
        for (int i = total - 1; i >= 0; i--) {
            System.out.println("para el índice = " + i + " : " + productos[i]);
        }
    }
}
