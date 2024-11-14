import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5;
        int j = 4;

        System.out.println("Suma:");
        int suma = i + j;

        System.out.println("suma = " + suma);
        System.out.println("i + j = " + i + j);
        System.out.println(i + j + "i + j = ");
        System.out.println("i + j = " + (i + j));

        System.out.println("Resta:");
        int resta = i - j;
        System.out.println("resta = " + resta);
        // System.out.println("i - j = " + i - j); // Esto daría un error
        System.out.println("i - j = " + (i - j));

        System.out.println("Multiplicación:");
        int multi = i *j;
        System.out.println("multi = " + multi);

        System.out.println("División");
        int div = i/j;
        float div2 = i/j;
        float div3 = (float) i/j;
        float div4 = (float) i / (float) j;
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);
        System.out.println("div3 = " + div3);
        System.out.println("div4 = " + div4);

        System.out.println("Módulo o resto:");
        int resto = i % j;
        System.out.println("resto = " + resto);
        
        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número;"));
        if(numero%2 == 0){
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar = " + numero);
        }
    }

}