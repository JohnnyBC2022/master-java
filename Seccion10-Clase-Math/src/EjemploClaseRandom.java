import java.util.Random;

public class EjemploClaseRandom {
    public static void main(String[] args) {
        // Aquí usaremos la clase Random
        Random randomObj = new Random();
        // Incluye negativos
        int randomInt = randomObj.nextInt(7);
        System.out.println("randomInt = " + randomInt);

        // para generar rangos entre 15 y 25
        randomInt = randomObj.nextInt(15,26);
        System.out.println("randomInt2 = " + randomInt);

        long randomLong = randomObj.nextLong();
        System.out.println("randomLong = " + randomLong);

        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores[randomInt] = " + colores[randomInt]);
    }
}
