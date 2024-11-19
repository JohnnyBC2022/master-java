import java.util.Scanner;

public class Tarea8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double sumaMayores5 = 0, sumaInferiores4 = 0, sumaTotal = 0;
        int contadorMayores5 = 0, contadorInferiores4 = 0, contadorNotas1 = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese la nota " + i + " (entre 1 y 7, o 0 para salir): ");
            double nota = s.nextDouble();

            if (nota == 0) {
                System.out.println("Error: Una de las notas ingresadas es 0. Finalizando el programa.");
                return;
            }

            if (nota < 1 || nota > 7) {
                System.out.println("Nota inválida. Debe estar entre 1 y 7.");
                i--;
                continue;
            }

            sumaTotal += nota;
            if (nota > 5) {
                sumaMayores5 += nota;
                contadorMayores5++;
            } else if (nota < 4) {
                sumaInferiores4 += nota;
                contadorInferiores4++;
            }

            if (nota == 1) {
                contadorNotas1++;
            }
        }

        // Calcular promedios
        double promedioMayores5 = (contadorMayores5 > 0) ? sumaMayores5 / contadorMayores5 : 0;
        double promedioInferiores4 = (contadorInferiores4 > 0) ? sumaInferiores4 / contadorInferiores4 : 0;
        double promedioTotal = sumaTotal / 20;

        // Mostrar resultados
        System.out.println("Promedio de notas mayores a 5: " + promedioMayores5);
        System.out.println("Promedio de notas inferiores a 4: " + promedioInferiores4);
        System.out.println("Cantidad de notas igual a 1: " + contadorNotas1);
        System.out.println("Promedio total de notas: " + promedioTotal);

        s.close();
    }
}
