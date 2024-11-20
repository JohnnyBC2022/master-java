public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000); // Ambos son objetos que contienen un valor
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("¿Son el mismo objeto? " + (num1 == num2));

        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("¿Son el mismo objeto? " + (num1 == num2)); // Vemos que contienen el mismo valor, pero no es la misma instancia
        // Cuando son clases Wrapper, comparan por el objeto y no por su valor. Mientras que los primitivos siempre comparar por su valor.
        // Esto aplica tb a Long, Short, ....

        // Para comparar por valor
        System.out.println("¿Tienen el mismo valor? " + (num1.equals(num2)));
        // O podemos convertir los objetos
        System.out.println("¿Tienen el mismo valor? " + (num1.intValue() == num2.intValue()));

        // Importante, hay que tener en cuenta una peculariedad del lenguaje JAVA y es que hasta 127 va a comparar de forma automática por el valor

        num2 = 500;
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num1.intValue() > num2.intValue();
        System.out.println("condicion2 = " + condicion2);


    }
}
