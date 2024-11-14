import java.util.Locale;

public class HelloWorld {
    public static void main(String[] args) {
        String name = "Jonathan";
        System.out.println("name.toUpperCase(Locale.ROOT) = " + name.toUpperCase(Locale.ROOT));
        System.out.println("Hello, my name is " + name);
        
        int number = 10;

        boolean value = true;
        int number2 = 5;
        if(value){
            System.out.println("number = " + number);
            number2 = 10;
        }
        System.out.println("number2 = " + number2);

        var number3 = "15";
        
        String name2;
        name2= "Johnny";

        if (number > 9) {
            name2 = "Pato";
        }
        System.out.println("name2 = " + name2);
    }
}
