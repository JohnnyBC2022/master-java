public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if (esNulo) {
            curso = "Programación Java";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank(); // esta es la forma más estricta de validar

        if (!esVacio2) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso " + curso);
        }

        if(!esBlanco) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso " + curso);
        }

    }
}
