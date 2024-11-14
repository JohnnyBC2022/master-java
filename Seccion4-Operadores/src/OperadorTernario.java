import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        // Es una versión abreviada de un if-else

        // variable = condición ? si es verdadero : si es falso
        String variable = 7 == 7 ? "Es verdadero" : "Es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce la nota de matemáticas: ");
        matematicas = s.nextDouble();

        System.out.println("Introduce la nota de ciencias: ");
        ciencias = s.nextDouble();

        System.out.println("Introduce la nota de historia: ");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);

        // Equivalente a:
        if (promedio >= 5) {
            estado = "Aprobado";
        } else {
            estado = "Rechazado";
        }
    }
}