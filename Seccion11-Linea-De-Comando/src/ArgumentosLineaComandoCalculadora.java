public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Introducir una operación (suma, resta, multi o div y dos números enteros");
            System.exit(-1);
        }
        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.00;

        switch (operacion) {
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multi":
                resultado = a * b;
                break;
            case "div":
                if (b == 0) {
                    System.out.println("No se puede dividir por 0");
                    System.exit(-1);
                }
                resultado = (double) a / b;
                break;
            default:
                resultado = a + b;
        }
        System.out.println("Resultado de la operación '" + operacion + "' es: " + resultado);

        // Recuerda:
        // Para compilar: javac ArgumentosLineaComandoCalculadora.java
        // Para ejecutar: java ArgumentosLineaComandoCalculadora

    }
}
