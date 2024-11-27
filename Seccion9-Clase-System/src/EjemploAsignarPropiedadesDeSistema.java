import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("Seccion9-Clase-System/src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");

            System.setProperties(p);
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));
            System.getProperties().list(System.out);
        } catch (Exception e) {
            System.out.println("No se encontró el archivo = " + e);
        }
    }
}
