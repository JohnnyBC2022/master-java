public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        // Hay que tener en cuenta el orden en que se hacen las operaciones

        // Si hacemos esto:
        double promedio = i + j + k / 3d;
        System.out.println("promedio = " + promedio);

        // Es como hacer esta operación:
        promedio = i + j + (k / 3d);
        System.out.println("promedio = " + promedio);

        // Lo correcto sería:
        promedio = (i + j + k) / 3d;
        System.out.println("promedio = " + promedio);

        double operacion = i + j + k / 3d * 10;
        // primero divide k entre 3 y lo  multiplica por 10 y luego hace las sumas de izquierda a derecha
        System.out.println("operacion = " + operacion);

        operacion = i + j + k / (3d * 10);
        // primero hace la operación que hay entre paréntesis, luego divide k entre 30 y luego hace las sumas
        System.out.println("operacion = " + operacion);

        operacion = ++i + j-- + k / 3d * 10;
        // Primero el pre-incremento de i, luego se evalúa k / 3d y se multiplica por 10, luego el post-decremento
        // y por último la usma de los elementos
        // Es decir, 15 + 8 (despúes de evaluar esta operación j valdrá 7) + 66.6 = 89.6
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("operacion = " + operacion);

    }
}
