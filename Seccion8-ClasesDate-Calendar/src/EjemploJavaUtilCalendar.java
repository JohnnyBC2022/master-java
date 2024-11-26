import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        // Calendar es una clase abstracta (no podemos crear una instancia con el operador new)
        Calendar calendario = Calendar.getInstance();

        calendario.set(2024, Calendar.APRIL, 25, 18, 25, 10);

        // hay que tener en cuenta que si ponemos un número mayor que 11 en los meses (Enero es 0) pasa al año siguiente
        // Lo mismo para días, horas, minutos, segundos

        calendario.set(Calendar.YEAR, 2024);
        calendario.set(Calendar.MONTH, 0);
        calendario.set(Calendar.MONTH, Calendar.JANUARY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 12);

        Date fecha = calendario.getTime();
        System.out.println("Fecha sin formato = " + fecha);

        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String fechaConFormato = sd.format(fecha);

        System.out.println("Fecha con formato = " + fechaConFormato);
    }
}
