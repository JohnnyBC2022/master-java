public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0;
        while(i < 5){
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;

        while (prueba){
            if(i ==7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        // Un while es un ciclo "pre-prueba " primero evalúa y luego ejecuta el código por eso en este código
        // nunca muestra ese mensaje
        prueba = false;
        while (prueba){
            System.out.println(" Nunca se ejecuta");
        }

        // El do while es un ciclo "post-prueba" primero ejecuta y luego evalúa.
        // En este ejemplo, se ejecuta al menos 1 vez y pasa a la siguiente evaluación.
        prueba = false;
        do {
            System.out.println("Se ejecuta");
        } while (prueba);

        prueba = true;
        i = 0;
        do{
            if (i == 10){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        } while (prueba);
    }
}
