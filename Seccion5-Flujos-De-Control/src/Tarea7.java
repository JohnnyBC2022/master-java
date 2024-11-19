import java.util.Scanner;

public class Tarea7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números a comparar (mínimo 10): ");
        int cantidad = s.nextInt();

        if (cantidad < 10){
            System.out.println("Debe introducir al menos 10 números. " );
            return;
        }

        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Ingrese un número " + i + ": ");
            int numero = s.nextInt();

            if (numero < menor){
                menor = numero;
            }
        }

        System.out.println("El número menor es: " + menor);

        if (menor < 10) {
            System.out.println("El número es menor que 10!");
        } else {
            System.out.println("El número es mayor o igual que 10" );
        }
    }
}
