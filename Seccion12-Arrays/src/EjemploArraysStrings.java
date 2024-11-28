import java.util.Arrays;

public class EjemploArraysStrings {
    public static void main(String[] args) {

        String[] productos = new String[4]; // instanciación del array (el valor por defecto de un string es null)

        productos[0] = "Pendrive 64GB";
        productos[1] = "Teléfono Móvil";
        productos[2] = "Disco Duro SSD 256 GB";
        productos[3] = "Ordenador Portátil";

        Arrays.sort(productos); // Podemos ordenar los productos por orden alfabético de sus valores (sirve para cualquier tipo de dato)

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);

    }
}
