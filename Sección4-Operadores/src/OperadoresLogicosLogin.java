import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String username = "jonathan";
        String password = "12345";

        String username2 = "admin";
        String password2 = "admin";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre de usuario.");

        String u = scanner.next();

        System.out.println("Introduce tu contraseña");

        String p = scanner.next();

        boolean esAutentificado = false;

        if (username.equals(u) && password.equals(p) || username2.equals(u) && password2.equals(p)) {
            esAutentificado = true;
        } else {
            System.out.println("El nombre de usuario o contraseña no es correcto");
        }

        if (esAutentificado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Lo siento, es necesario loguearse");
        }
    }
}
