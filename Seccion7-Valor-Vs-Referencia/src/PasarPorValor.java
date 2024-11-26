public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10; // Una variable primitiva siempre se pasa por valor
        // Integer i = 10;

        System.out.println("Iniciamos el método main con i = " + i);
        test(i);
        System.out.println("Finaliza el método main con el valor de i = " + i);
    }

    // probar poniendo como parámetro Integer i
    public static void test(int i) {
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Finaliza el método test con i = " + i);
    }

    // Con Integer (al igual que ocurre con String o Double, Float) es una clase inmutable
    // cuando cambia el valor cambia la referencia
}
