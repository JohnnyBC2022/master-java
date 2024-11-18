public class SentenciaSwitchCase {
    public static void main(String[] args) {

        int num = 1;
        // Hay que tener en cuenta que switch no admite cualquier tipo de dato
        switch (num) {
            case 0:
                System.out.println("El num es cero");
                break;
            case 1:
                System.out.println("El num es uno");
                break; // Si no utilizamos break, ejecuta las instrucciones cuando es case 1, pero también ejecuta las
                // instrucciones del case 2 y 3
            case 2:
                System.out.println("El num es dos");
                break;
            case 3:
                System.out.println("El num es tres");
                break;
            default:
                System.out.println("Número desconocido");
                break;
        }

        String nombre = "pedro";

        switch (nombre){
            default:
                System.out.println("Usuario desconocido"); // el default se puede poner primero, pero ten en cuenta el break
            case "admin":
                System.out.println("Hola, Admin, bienvenido");
                break;
            case "jonathan":
                System.out.println("Hola, Jonathan, bienvenido");
                break;
            case "pepe":
                System.out.println("Hola, Pepe, bienvenido");
                break;
        }
    }
}
