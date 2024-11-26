import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        // Vamos a convertir un String a un objeto fecha (como viene en un formulario)

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println(" Introduzca una fecha con formato: dd-MM-yyyy " );

        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
