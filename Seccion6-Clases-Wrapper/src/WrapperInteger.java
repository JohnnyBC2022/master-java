public class WrapperInteger {
    public static void main(String[] args) {

        // Conversión de dato primitivo a objeto
        int intPrimitivo = 32768;
        // Integer intObjeto = new Integer(32768); Recuerda, que crear instancias de esta forma está deprecada
        Integer intObjeto = Integer.valueOf(intPrimitivo); // A esta forma de crear el objeto se le conoce como Boxing
        Integer intObjeto2 = 32768; // También se puede crear de forma automática y a esta manera de hacerlo se conoce como Autoboxing
        System.out.println("intObjeto = " + intObjeto);
        System.out.println("intObjeto2 = " + intObjeto2);

        // Conversión de objeto a dato primitivo
        int num = intObjeto2; // Esta es la forma automática o implícita
        int num2 = intObjeto.intValue(); // De forma explicita, lo que hace es coger el objeto y devolver el valor en forma de dato primitivo
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto = 32767; // Da un error si ponemos 32768 porque un short va hasta 32767
        // Pero si hacemos esto:
        Short shortObjeto2 = intObjeto.shortValue();
        System.out.println("shortObjeto2 = " + shortObjeto2); // No da error, pero provocará pérdida de información dando un resultado ambigüo
        
        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto); // Tenemos el mismo problema, ojo con los valores que byte va hasta 127, con 128 perdemos información

        // Hay que tener en cuenta que convertir hacia datos de mayor rango de valores no hay problema, pero hacia abajo hay que tener cuidado.
        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);

    }
}
