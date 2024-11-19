
public class SentenciaIfElse {
    public static void main(String[] args) {

        float media = 5.8f;

        if (media >= 6.5) {
            System.out.println("Felicidades, excelente media");
        } else if (media >= 6.0) {
            System.out.println("Muy buen media");
        } else if (media >= 5.5) {
            System.out.println("Buena media");
        } else if (media >= 5.0) {
            System.out.println("Regular, necesitas esforzarte más");
        } else if (media >= 4.0) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("Suspenso");
        }

        System.out.println("Tu nota media es: " + media);
    }
}