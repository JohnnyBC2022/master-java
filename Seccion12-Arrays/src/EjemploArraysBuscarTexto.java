import java.util.Scanner;

public class EjemploArraysBuscarTexto {
    public static void main(String[] args) {

        String[] a = new String[5];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Introduzca una palabra: ");
            a[i] = s.next();
        }

        System.out.println("\r\nIntroduzca una palabra a buscar: ");
        String palabra = s.next();
        int i = 0;
        for (;i < a.length && a[i].equalsIgnoreCase(palabra); i++) {
        }

        if (i == a.length) {
            System.out.println("Palabra no encontrada.");
        } else if (a[i].toLowerCase().compareTo(palabra.toLowerCase()) == 0) {
            System.out.println("Encontrada en la posición: " + i);
        }

    }
}
