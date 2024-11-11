public class OperadoresIncrementales {
    public static void main(String[] args) {

        int i = 1;
        // Preincremento =>  Incrementa primero, luego usa el nuevo valor.
        int j = ++i; // i = i + 1;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Postincremento =>  Usa primero el valor actual, luego incrementa.
        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Predecremento
        i = 3;
        j = --i; // i = i -1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Postdecremento
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("(j++) = " + (j++));
        System.out.println("j = " + j);

        // Resumen:
        // ++a Preincremento => Incrementa en uno y luego devuelve a
        // a++ Postincremento => Devuelva a y luego incrementa en uno
        // --a Predecremento => Decrementa en uno y luego devuelve a
        // a-- Postdecremento => Devuelva a y luego decrementa en uno

        // Los operadores de incremento y decremento se pueden colocar tanto antes como después de la expresión
        // que deseemos modificar pero sólo devuelven el valor modificado si están delante.
    }
}
