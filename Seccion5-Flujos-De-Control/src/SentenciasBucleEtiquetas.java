public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {
        // Etiquetar a un ciclo en concreto

        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }
        System.out.println("\n---------------------------------------------");
        etiqueta:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break etiqueta;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }

        System.out.println("\n---------------------------------------------");
        bucle2:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            int j = 0;
            while (j < 5) {
                if (i == 2) {
                    continue bucle2;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
                j++;
            }
        }

        System.out.println("\n---------------------------------------------");
        etiqueta2:
        for (int i = 1; i <= 7; i++) {

            int j = 1;
            while (j < 8) {
                if (i == 6 || i == 7) {
                    System.out.println("Día " + i + ": fin de semana!!!");
                    continue etiqueta2;
                }
                System.out.println("Día = " + i + " trabajado " + j + " horas ");
                j++;
            }
        }
    }
}
