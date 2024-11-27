import java.util.Scanner;

public class Tarea12 {
    public static void main(String[] args) {
        /*
            Pedir el radio de un círculo y calcular su área.
         */
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el radio de un círculo para calcular su área");
        double radio = s.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del círculo con radio " + radio + " es: " + area);
    }
}
