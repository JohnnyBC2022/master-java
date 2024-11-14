import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Introduce el segundo nombre: ");
        String nombre2 = scanner.nextLine();

        System.out.print("Introduce el tercer nombre: ");
        String nombre3 = scanner.nextLine();

        String nombreProcesado1 = nombre1.substring(1, 2).toUpperCase() + "." + nombre1.substring(nombre1.length() - 2);
        String nombreProcesado2 = nombre2.substring(1, 2).toUpperCase() + "." + nombre2.substring(nombre2.length() - 2);
        String nombreProcesado3 = nombre3.substring(1, 2).toUpperCase() + "." + nombre3.substring(nombre3.length() - 2);

        System.out.println(nombreProcesado1 + "_" + nombreProcesado2 + "_" + nombreProcesado3);
    }
}
