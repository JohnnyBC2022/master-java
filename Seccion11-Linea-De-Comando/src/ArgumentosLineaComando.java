public class ArgumentosLineaComando {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Debe introducir algún argumento o parámetros!");
            System.exit(-1);
        }

        for (int i = 0; i < args.length; i++){
            System.out.println("Argumentos nº " + i + ": " + args[i]);
        }

        // si nos devuelve un juego de caracteres extraños cuando compilamos con javac desde el terminal
        // podemos hacer lo siguiente: javac ArgumentosLineaComando.java -encoding utf8
    }
}
