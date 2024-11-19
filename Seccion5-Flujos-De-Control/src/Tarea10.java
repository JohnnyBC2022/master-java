import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Tarea10 {
    public static void main(String[] args) {

        Map<String, Integer> opciones = new HashMap<>();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray();

        int opcionIndice = 0;

        do {
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione una opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación.");
                continue;
            }

            opcionIndice = opciones.get(opcion.toString());

            switch (opcionIndice) {
                case 1: // Actualizar
                    JOptionPane.showMessageDialog(null, "Producto actualizado correctamente.");
                    break;

                case 2: // Eliminar
                    JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
                    break;

                case 3: // Agregar
                    JOptionPane.showMessageDialog(null, "Producto agregado correctamente.");
                    break;

                case 4: // Listar
                    JOptionPane.showMessageDialog(null, "Listado de productos mostrado.");
                    break;

                case 5: // Salir
                    JOptionPane.showMessageDialog(null, "¡Has salido con éxito!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }

        } while (opcionIndice != 5);
    }
}
