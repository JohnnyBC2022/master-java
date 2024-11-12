public class OperadoresLogicos {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        // Operador AND

        boolean b1 = i == j && k < l && m == false;
        System.out.println("b1 = " + b1);
        
        // Operador OR
        boolean b2 = i == j || k > l;
        System.out.println("b2 = " + b2);

        // Se evalúa de izquierda a derecha
        boolean b3 = i == j && k > l || m == false;
        System.out.println("b3 = " + b3);

        // Para cambiar la precedencia
        boolean b4 = i == j && (k > l || m == false);
        System.out.println("b4 = " + b4);
    }
}
