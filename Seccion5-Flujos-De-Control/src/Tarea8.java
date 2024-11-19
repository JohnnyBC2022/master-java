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

        double promedioMayores5 = (contadorMayores5 > 0) ? sumaMayores5 / contadorMayores5 : 0;
        double promedioInferiores4 = (contadorInferiores4 > 0) ? sumaInferiores4 / contadorInferiores4 : 0;
        double promedioTotal = sumaTotal / 20;

        System.out.println("Promedio de notas mayores a 5: " + promedioMayores5);
        System.out.println("Promedio de notas inferiores a 4: " + promedioInferiores4);
        System.out.println("Cantidad de notas igual a 1: " + contadorNotas1);
        System.out.println("Promedio total de notas: " + promedioTotal);

        s.close();
    }
    /*
    Solución formador:
    import java.util.Scanner;

public class PromedioNotasAlumnos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota; // la nota a ingresar
        int contNotas1 = 0; // el contador de notas 1
        int contNotasMayoresA5 = 0; // contador de notas mayores a 5
        int contNotasMenoresA4 = 0; // contador de notas menores a 4
        double sumaNotasMayoresA5 = 0; // suma de notas mayores a 5
        double sumaNotasMenoresA4 = 0; // suma de notas menores a 4
        double sumaTotal = 0; // suma total de notas

        double promedioNotasMayoresA5, promedioNotasMenoresA4; // los promedios de notas mayores a 5 y menores a 4

        boolean error = false;

        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce una nota (entre 1 y 7) N" + (i + 1) + ": ");
            nota = scanner.nextDouble();

            if (nota == 0) {
                error = true;
                break;
            }

            if (nota == 1) {
                contNotas1++;
            } else {
                if (nota > 5) {
                    contNotasMayoresA5++;
                    sumaNotasMayoresA5 += nota;
                } else if (nota < 4) {
                    contNotasMenoresA4++;
                    sumaNotasMenoresA4 += nota;
                }
            }
            sumaTotal += nota;
        }
        if (error) {
            System.err.println("Error: No pueden haber notas con valor 0, ha finalizado la ejecución del programa.");
            System.exit(1);
        }
        // mostramos la cantidad de notas 1
        System.out.println("El número de notas 1 es de: " + contNotas1);
        //trabajamos con las notas superiores a 5
        if (contNotasMayoresA5 == 0) {
            System.out.println("No se puede calcular el promedio de notas sobre 5");
        } else {
            promedioNotasMayoresA5 = sumaNotasMayoresA5 / contNotasMayoresA5;
            System.out.println("Promedio de notas mayores a 5: " + promedioNotasMayoresA5);
        }

        // trabajamos con las notas inferiores a 4
        if (contNotasMenoresA4 == 0) {
            System.out.println("No se puede calcular el promedio de notas bajo 4");
        } else {
            promedioNotasMenoresA4 = sumaNotasMenoresA4 / contNotasMenoresA4;
            System.out.println("Promedio de notas menores a 3: " + promedioNotasMenoresA4);
        }

        // promedio total de las notas
        double promedioTotalNotas = sumaTotal / 20;
        System.out.println("Promedio total de notas: " + promedioTotalNotas);
    }
}
     */
}
