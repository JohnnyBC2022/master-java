import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema2 {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("Seccion9-Clase-System/src/config2.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");

            System.setProperties(p);
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));
            System.getProperties().list(System.out);
        } catch (Exception e) {
            System.err.println("No se encontró el archivo = " + e); // En vez System.out
            System.exit(1);
            // main(args) En función de la clase podemos volver a ejecutar el main
        }

        // Cuando estamos trabajando con muchos objetos, podemos invocar directamente al
        // recolector de basura para que nos limpie las instancias
        // System.gc();

    }
}
