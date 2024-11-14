public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = 'A'; //los caracteres se definen con comillas simples
        char caracterUnicode = '\u0040'; //@
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("caracterUnicode = " + caracterUnicode);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracterUnicode));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracterUnicode));

        char espacio = ' ';
        char espacio2 = '\u0020'; //en Unicode
        char retroceso = '\b'; //backspace
        char tabulador = '\t'; // espacio de tabulación \t, \b, etc se pueden utilizar en strings
        char nuevaLinea = '\n'; // salto de línea
        char retornoCarro = '\r'; // salto de carro (se sitúa en el principio de la línea, puede variar en función del SO)

        System.out.println("char corresponde en byte:" + espacio + Character.BYTES);
        System.out.println("char corresponde en bites:" + espacio2 + Character.SIZE);
        System.out.println("Máximo valor de char: " + tabulador + Character.MAX_VALUE); //espacio en blanco
        System.out.println("Mínimo valor de char: "+ nuevaLinea + retornoCarro + Character.MIN_VALUE); //otro caracter especial

        //Otro atajo de teclado: renombrar variables y clases (sería como ir a file->refactor->rename) shift+F6
    }
}
