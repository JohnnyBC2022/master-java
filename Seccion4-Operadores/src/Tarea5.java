/*
    Suponiendo un depósito de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...

La medida o capacidad actual del depósito puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.

Si la capacidad actual es 70 litros: imprimir depósito lleno

Si está entre 60 y menor a 70: imprimir depósito casi lleno

Si está entre 40 y menor a 60: imprimir depósito  3/4

Si está entre 35 y menor a 40: imprimir Medio depósito

Si está entre 20 y menor a 35: imprimir Suficiente

Si está entre 1 y menor a 20: imprimir En reserva
 */

import java.util.Scanner;

public class Tarea5 {
    public static void main(String[] args) {
        double cantidad;

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce una cantidad:");
        cantidad = s.nextDouble();

        if (cantidad > 70) {
            System.out.println("Estás tirando combustible por el suelo");
        } else if (cantidad == 70) {
            System.out.println("Depósito lleno");
        } else if (cantidad >= 60) {
            System.out.println("Depósito casi lleno");
        } else if (cantidad >= 40) {
            System.out.println("Depósito a 3/4 de capacidad");
        } else if (cantidad >= 35) {
            System.out.println("Depósito a la mitad");
        } else if (cantidad >= 20) {
            System.out.println("Todavía tienes combustible suficiente");
        } else if (cantidad >= 1) {
            System.out.println("Te estás quedando sin combustible");
        } else if (cantidad == 0) {
            System.out.println("Depósito vacío");
        } else {
            System.out.println("No es una cantidad válida");
        }
    }

    /*
    solución del instructor
    import java.util.Scanner;

public class Tarea5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacidadActual; // la capacidad a ingresar

        System.out.println("Introduzca la capacidad actual del estanque (máx 70 litros): ");
        capacidadActual = scanner.nextDouble();

        if (capacidadActual >= 0 && capacidadActual < 20) {
            System.out.println("Insuficiente");
        } else if (capacidadActual >= 20 && capacidadActual < 35) {
            System.out.println("Suficiente");
        } else if (capacidadActual >= 35 && capacidadActual < 40) {
            System.out.println("Medio Estanque");
        } else if (capacidadActual >= 40 && capacidadActual < 60) {
            System.out.println("Estanque  3/4");
        } else if (capacidadActual >= 60 && capacidadActual < 70) {
            System.out.println("Estanque casi lleno");
        } else if (capacidadActual == 70) {
            System.out.println("Estanque lleno");
        }
    }
}
     */
}
