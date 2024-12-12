public class Automovil {

    String fabricante;
    String modelo;
    String color = "rojo";
    double cilindrada;
    int capacidadDeposito = 40;

    /*
    public void detalle(){
        String modelo = "otro";
        System.out.println("fabricante = " + this.fabricante);
        System.out.println("modelo = " + this.modelo);
        // el this se puede omitir si no tenemos más variables con el mismo nombre. En este caso,
        // si lo quitamos va a coger el valor "otro"
        System.out.println("color = " + this.color);
        System.out.println("cilindrada = " + this.cilindrada);
        // Esto lo hemos hecho así para el ejemplo, pero se recomienda que dentro de una clase o objetos
        // no se impriman datos. La idea es que los métodos ejecuten alguna tarea y se impriman en el main
    }

     */

    public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("fabricante = " + this.fabricante);
        sb.append("\nmodelo = " + this.modelo);
        sb.append("\ncolor = " + this.color);
        sb.append("\ncilindrada = " + this.cilindrada);
        return sb.toString();
    }

    public String acelerar(int rpm){
        return "El vehículo " + fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = frenar();

        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeGasolina) {
        return km/(capacidadDeposito*porcentajeGasolina);
    }

    // Tener dos funciones iguales pero que tienen argumentos con tipos distintos o una cantidad
    // distinta de parámetros es lo que se conoce como SOBRECARGA DE MÉTODOS.
    public float calcularConsumo(int km, int porcentajeGasolina) {
        return km/(capacidadDeposito*(porcentajeGasolina/100f));
    }
}
