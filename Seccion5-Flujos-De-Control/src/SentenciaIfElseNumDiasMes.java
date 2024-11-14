import java.util.Scanner;

public class SentenciaIfElseNumDiasMes {
    public static void main(String[] args) {
        int numeroDias = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce el mes del año del 1-12:");
        int mes = s.nextInt();

        System.out.println("Introduce el año :");
        int anio = s.nextInt();

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            numeroDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numeroDias = 30;
        } else if (mes == 2) {
            if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
                numeroDias = 29;
            } else {
                numeroDias = 28;
            }
        }
        System.out.println("numeroDias = " + numeroDias);
    }
}