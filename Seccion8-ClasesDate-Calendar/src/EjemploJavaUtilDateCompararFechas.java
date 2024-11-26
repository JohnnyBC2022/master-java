import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateCompararFechas {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println(" Introduzca una fecha con formato: dd-MM-yyyy ");

        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();

            if (fecha.after(fecha2)) {
                System.out.println("La fecha del usuario es posterior que la fecha actual");
            } else if (fecha.before(fecha2)) {
                System.out.println("La fecha del usuario es anterior que la fecha actual");
            } else if (fecha.equals(fecha2)) {
                System.out.println("La fecha del usuario es la misma que la fecha actual");
            }

            // Otra forma
            if (fecha.compareTo(fecha2) > 0) {
                System.out.println("La fecha del usuario es posterior que la fecha actual");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("La fecha del usuario es anterior que la fecha actual");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("La fecha del usuario es la misma que la fecha actual");
            }

            // Esto también se puede hacer con Calendar
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
