public class BucleForEach {
    public static void main(String[] args) {
        // Este es un bucle solo para arrays u objetos
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        for (int num: numeros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Jonathan", "Pepe", "Maria", "Paco", "Bea", "Lalo", "Pato", "Pepa"};

        for(String nombre: nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
