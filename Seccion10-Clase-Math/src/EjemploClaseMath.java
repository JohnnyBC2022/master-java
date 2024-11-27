public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        double redondeoPorArriba = Math.ceil(3.5);
        System.out.println("redondeoPorArriba = " + redondeoPorArriba);

        double redondeoPorAbajo = Math.floor(3.5);
        System.out.println("redondeoPorAbajo = " + redondeoPorAbajo);

        long redondeo = Math.round(3.5);
        System.out.println("redondeo = " + redondeo);

        long redondeo2 = Math.round(3.4);
        System.out.println("redondeo = " + redondeo2);

        long redondeo3 = Math.round(Math.PI);
        System.out.println("redondeo = " + redondeo3);

        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(25);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("convertir de radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("convertir de grados a radianes = " + radianes);

        System.out.println("sin(90): " + Math.sin(radianes));
        System.out.println("cos(90): " + Math.cos(radianes));

        radianes = Math.toRadians(180.00);
        System.out.println("sin(180): " + Math.sin(radianes));
        System.out.println("cos(180): " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("sin(0): " + Math.sin(radianes));
        System.out.println("cos(0): " + Math.cos(radianes));
    }
}
