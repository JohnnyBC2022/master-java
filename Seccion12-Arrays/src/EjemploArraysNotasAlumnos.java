import java.util.Scanner;

public class EjemploArraysNotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        double sumaNotasMatematicas = 0, sumaNotasHistoria = 0, sumaNotasLenguaje = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca 7 notas de estudiantes para matemáticas");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = s.nextDouble();
        }

        System.out.println("Introduzca 7 notas de estudiantes para historia");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = s.nextDouble();
        }

        System.out.println("Introduzca 7 notas de estudiantes para lenguaje");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = s.nextDouble();
        }

        for (int i = 0; i < claseMatematicas.length; i++) {
            sumaNotasMatematicas += claseMatematicas[i];
            sumaNotasHistoria += claseHistoria[i];
            sumaNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematicas = sumaNotasMatematicas / claseMatematicas.length;
        double promedioHistoria = sumaNotasHistoria / claseHistoria.length;
        double promedioLenguaje = sumaNotasLenguaje / claseLenguaje.length;

        System.out.println("Promedio clase matemáticas: " + promedioMatematicas);
        System.out.println("Promedio clase historia: " + promedioHistoria);
        System.out.println("Promedio clase lenguaje: " + promedioLenguaje);

        System.out.println("Promedio total del curso: " + (promedioMatematicas + promedioHistoria + promedioLenguaje) / 3);

        System.out.println("Introducir el identificador del alumno de (0-6): ");
        int id = s.nextInt();
        double promedioAlumno = (claseMatematicas[id] + claseHistoria[id] + claseLenguaje[id]) / 3;
        System.out.println("promedio alumno Nº: " + id + " : " + promedioAlumno);
    }
}
