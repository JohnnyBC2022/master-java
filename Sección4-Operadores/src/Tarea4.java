import java.util.Scanner;

/*
Pedir dos números y mostrarlos ordenados de mayor a menor
 */

public class Tarea4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int num1 = s.nextInt();

        System.out.println("Introduce el segundo número: ");
        int num2 = s.nextInt();

        System.out.println((num1 > num2) ?
                "El primer número es " + num1 + " y el segundo " + num2 :
                "El primer número es " + num2 + " y el segundo " + num1
        );
    }
}
