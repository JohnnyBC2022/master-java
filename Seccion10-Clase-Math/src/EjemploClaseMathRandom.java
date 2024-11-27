public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        double random = Math.random();
        System.out.println("random = " + random); //Devuelve un número aleatorio entre 0-1 (incluye el 0 y no incluye el 1)
        // Obtener un número aleatorio entre 0 y 7 (no incluye el 7)
        random *= 7;

        System.out.println("random = " + random);

        // podemos jugar con los redondeos
        random = Math.floor(random);
        System.out.println("random = " + random);

        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
        random *= colores.length;
        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores[(int) random] = " + colores[(int) random]);
    }
}
