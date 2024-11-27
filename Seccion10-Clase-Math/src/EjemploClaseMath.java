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

    }
}
