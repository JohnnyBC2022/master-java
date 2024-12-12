public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil toyota = new Automovil();

        /*
        Ahora ya no accedemos así:
        toyota.fabricante = "Toyota";
        toyota.modelo = "Celica";
        toyota.cilindrada = 2.0;
        toyota.color = "azul";
         */

        toyota.asignarFabricante("Toyota");
        toyota.asignarModelo("Celica");
        toyota.asignarCilindrada(2.0);
        toyota.asignarColor("azul");

        // Y para leer los datos:
        System.out.println("Fabricante: " + toyota.leerFabricante());

        Automovil mazda = new Automovil();
        /*
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cilindrada = 3.0;
        mazda.color = "rojo";
         */

        mazda.asignarFabricante("Mazda");
        mazda.asignarModelo("BT-50");
        mazda.asignarCilindrada(3.0);
        mazda.asignarColor("rojo");

        System.out.println(toyota.detalle());
        System.out.println(mazda.detalle());
        System.out.println(toyota.acelerar(3000));
        System.out.println(toyota.frenar());

        System.out.println(mazda.acelerarFrenar(2500));

        System.out.println("Kilómetors por litro " + toyota.calcularConsumo(300, 0.75f));
        System.out.println("Kilómetors por litro " + toyota.calcularConsumo(300, 75));


//        System.out.println();
//        System.out.println("mazda.fabricante = " + mazda.fabricante);
//        System.out.println("mazda.modelo = " + mazda.modelo);
//        System.out.println("mazda.color = " + mazda.color);
//        System.out.println("mazda.cilindrada = " + mazda.cilindrada);
    }
}
