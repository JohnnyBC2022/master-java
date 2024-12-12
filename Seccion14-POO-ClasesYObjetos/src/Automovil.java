public class Automovil {

    private String fabricante;
    // si hacemos private String fabricante solo se va a poder acceder a este atributo dentro de la clase
    private String modelo;
    private String color = "rojo";
    private double cilindrada;
    private int capacidadDeposito = 40;

    // Lo habitual es hacer que los atributos sean privados para que no se pueda acceder desde fuera de la clase
    // Y para que podamos acceder a ellos desde otras clases, se utilizan métodos public para leer

    public String leerFabricante(){
        return this.fabricante;
    }

    public String leerModelo(){
        return this.modelo;
    }

    public String leerColor(){
        return this.color;
    }

    public double leerCilindrada(){
        return this.cilindrada;
    }

    public int leerCapacidadDeposito(){
        return this.capacidadDeposito;
    }

    // y también métodos para actualizar, modificar o establecer
    public void asignarFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public void asignarModelo(String modelo){
        this.modelo = modelo;
    }

    public void asignarColor(String color){
        this.color = color;
    }

    public void asignarCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public void asignarCapacidadDeposito(int capacidadDeposito){
        this.capacidadDeposito = capacidadDeposito;
    }



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
