import java.util.Scanner;

public class OperadoresLogicosLogin2 {
    public static void main(String[] args) {

        /*
        String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "Jonathan";
        passwords[0] = "12345";

        usernames[1] = "Admin";
        passwords[1] = "admin";

        usernames[2] = "Pepe";
        passwords[2] = "12345";

         */

        String[] usernames = {"Jonathan", "Admin", "Pepe"};
        String[] passwords = {"12345", "admin", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre de usuario.");

        String u = scanner.next();

        System.out.println("Introduce tu contraseña");

        String p = scanner.next();

        boolean esAutentificado = false;

        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(u) && passwords[i].equals(p)) {
                esAutentificado = true;
                break; // para que no siga iterando si ya encontró al usuario
            }
        }

        if (esAutentificado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("El nombre de usuario o contraseña no es correcto");
            System.out.println("Lo siento, es necesario loguearse");
        }
    }
}
