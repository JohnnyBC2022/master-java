public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numberByte = 127;
        System.out.println("numberByte = " + numberByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en byte a " + Byte.SIZE);
        System.out.println("valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("valor mínimo de un byte: " + Byte.MIN_VALUE);

       /* Atajos de teclado interesantes: seleccionar todas concurrencias ctrl+shift+alt+j
        Atajos de teclado interesantes: seleccionar siguiente concurrencia alt+j
        Atajos de teclado interesantes: duplicar ctrl+d
        Atajos de teclado interesantes: comentarios de linea: ctrl+/
        Atajos de teclado interesantes: comentarios multilinea: ctrl+shift+/
        Atajos de teclado interesantes: comentarios multilinea: ctrl+shift+/
        Atajos de teclado interesantes: cursor multilínea: seleccionar con el ratón y ctrl+shift+alt*/

        short numberShort = 32767;
        System.out.println("numberShort = " + numberShort);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("valor mínimo de un short " + Short.MIN_VALUE);

        int numberInt = 2147483647;
        System.out.println("numberInt = " + numberInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int in orresponde en bites a " + Integer.SIZE);
        System.out.println("valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("valor mínimo de un int: " + Integer.MIN_VALUE);

        long numberLong = 2147483648L; // 2147483648 daría error
        System.out.println("numberLong = " + numberLong);
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long in orresponde en bites a " + Long.SIZE);
        System.out.println("valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("valor mínimo de un long: " + Long.MIN_VALUE);

        // variable flexible desde Java 10;
        var numberVar = 127;



    }
}
