public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;


        int cantidad = 0;
        char letra = 'g';

        buscar:
        for (int i = 0; i <= maxFrase;) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra '" + palabra + "' en la frase");

        /*
        Flujo de ejecución del programa:
        1. El programa comienza buscando desde el primer carácter de la frase (i = 0).
        2. Para cada posición i, verifica si los caracteres siguientes coinciden con la palabra que buscamos.
        3. Si se encuentra una coincidencia completa, incrementa el contador cantidad.
        4. Si hay una diferencia en cualquier carácter, el bucle interno se interrumpe inmediatamente y el programa pasa a la siguiente posición i.
        5. Este proceso se repite hasta que se recorra toda la frase.
         */
    }
}
