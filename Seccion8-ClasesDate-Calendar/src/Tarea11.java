import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Tarea11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca su fecha de nacimiento con formato dd-MM-yyyy: ");
        String fechaNacimientoStr = s.next();

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date fechaNacimiento = format.parse(fechaNacimientoStr);
            Date fechaActual = new Date();
            int edad = calcularEdad(fechaNacimiento, fechaActual);

            System.out.println("Tu fecha de nacimiento es: " + format.format(fechaNacimiento));
            System.out.println("Tienes " + edad + " años.");


        } catch (ParseException e) {
            System.out.println("Formato de fecha inválido. Por favor, usa el formato dd-MM-yyyy.");
        }
    }

    private static int calcularEdad(Date fechaNacimiento, Date fechaActual) {

        int anioNacimiento = fechaNacimiento.getYear() + 1900;
        int mesNacimiento = fechaNacimiento.getMonth();
        int diaNacimiento = fechaNacimiento.getDate();

        int anioActual = fechaActual.getYear() + 1900;
        int mesActual = fechaActual.getMonth();
        int diaActual = fechaActual.getDate();


        int edad = anioActual - anioNacimiento;


        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--;
        }

        return edad;
    }


    /*

    public class ProgramaCalculoEdad {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una fecha de nacimiento con formato yyyy-MM-dd:");
        String fechaStr = scanner.next();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNacimiento = df.parse(fechaStr);
        Date actual = new Date();

        // creamos un patron de fecha numérico con el año mes y día
        df = new SimpleDateFormat("yyyyMMdd");

        // luego convertimos ambas fechas la actual y la fecha de nacimiento
        // en enteros que contiene el año mes y día
        int desde = Integer.parseInt(df.format(fechaNacimiento));
        int hasta = Integer.parseInt(df.format(actual));

        // luego restamos ambas fechas y dividimos en 10000 para quitar decimales y
        // dejar la fecha en decenas o centenas
        int edad = (hasta - desde) / 10000;
        System.out.println("La edad es: " + edad);
    }
}
     */
}
