import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hola, qué tal!";

        Class strClass = texto.getClass();
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getSimpleName());
        System.out.println("strClass.getName() = " + strClass.getPackage());
        System.out.println("strClass.getName() = " + strClass.getPackageName());
        System.out.println("strClass.getName() = " + strClass);

        for(Method metodo: strClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName()); //Se repiten por la sobrecarga de métodos, es decir, porque reciben distintos tipos de argumentos
        }

        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass()

        System.out.println("intClass.getName() = " + intClass.getName());
        System.out.println("intClass.getName() = " + intClass.getSimpleName());
        System.out.println("intClass.getName() = " + intClass.getPackage());
        System.out.println("intClass.getName() = " + intClass.getPackageName());
        System.out.println("intClass.getName() = " + intClass.getSuperclass());
        System.out.println("objClass = " + objClass);

        for (Method metodo: objClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }
    }
}
