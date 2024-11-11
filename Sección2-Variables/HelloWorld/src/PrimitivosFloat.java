public class PrimitivosFloat {
    public static void main(String[] args) {

        /*Hay que fijarse en los literales ("valores que toman por defecto") ya que si por ejemplo
         ponemos float= 3.14 por defecto toma un valor double, así que si queremos que sea tipo float
         hay que poner float=3.14f o float=3.14F */
        
        float realFloat = 2.12e3f; // 2120f;
        System.out.println("realFloat = " + realFloat);
        System.out.println(" float corresponde en byte a " + Float.BYTES);
        System.out.println(" float corresponde en bites a " + Float.SIZE);
        System.out.println(" máximo valor de float " + Float.MAX_VALUE);
        System.out.println(" mínimo valor de float " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println(" double corresponde en byte a " + Double.BYTES);
        System.out.println(" double corresponde en bites a " + Double.SIZE);
        System.out.println(" máximo valor de double " + Double.MAX_VALUE);
        System.out.println(" mínimo valor de double " + Double.MIN_VALUE);

        var varFloat = 3.1416f;
        System.out.println("varFloat = " + varFloat);

    }
}
