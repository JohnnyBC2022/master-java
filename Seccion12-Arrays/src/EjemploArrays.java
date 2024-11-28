public class EjemploArrays {
    public static void main(String[] args) {

        int[] numeros = new int[4]; // instanciación del array (los valores por defecto de un entero es 0)

        numeros[0] = 1; // inicialización
        numeros[1] = Integer.valueOf("2");
        numeros[2] = (int) 3L;
        numeros[3] = 4;
        // numeros[4] = 5;

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];
        // int m = numeros[4];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
