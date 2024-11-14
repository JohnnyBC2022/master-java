public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Jonathan";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Jonathan\") = " + nombre.equals("Jonathan"));
        System.out.println("nombre.equals(\"jonathan\") = " + nombre.equals("jonathan"));
        System.out.println("nombre.equals(\"jonathan\") = " + nombre.equalsIgnoreCase("jonathan"));
        System.out.println("nombre.compareTo(\"Jonathan\") = " + nombre.compareTo("Jonathan")); //orden lexicográfico: El orden lexicográfico en Java se refiere al ordenamiento de elementos basado en su secuencia de caracteres en orden alfabético. En el contexto de cadenas de texto, por ejemplo, el orden lexicográfico ordenaría las palabras de acuerdo con su posición en el diccionario
        System.out.println("nombre.compareTo(\"Andrés\") = " + nombre.compareTo("Andrés"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length() -1) = " + nombre.charAt(nombre.length() - 1));

        System.out.println("nombre.substring(2) = " + nombre.substring(2));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(5, 8));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length() - 2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z')); // si devuelve un número negativo es que no lo encontró
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"traba\") = " + trabalenguas.endsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas  ".trim()); //importante este método sobre todo en formularios limpia espacios al principio y al final



    }
}
