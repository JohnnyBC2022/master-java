import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy");
        SimpleDateFormat df2 = new SimpleDateFormat(" 'fecha: 'dd/MM/yyyy");
        String fechaStr = df.format(fecha);
        String fechaStr2 = df2.format(fecha);

        System.out.println("fechaStr = " + fechaStr);
        System.out.println("fechaStr2 = " + fechaStr2);

        // Se pueden ver distintos formatos buscando en google SimpleDateFormat Java
    }
}
