import java.util.Scanner;

public class EjemploArraysNumeroMayor {
    public static void main(String[] args) {

        int[] a = new int[5];
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce 5 números enteros:");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        int max = 0;
        for (int i = 0; i < a.length; i++) {
            max = (a[max] > a[i]) ? max : i;
        }
        System.out.println("max = " + a[max]);
    }
}
