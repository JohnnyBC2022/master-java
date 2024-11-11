public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
       String a = "a";
       String b = "b";
       String c = a;

       StringBuilder sb = new StringBuilder(a);

       long inicio = System.currentTimeMillis();

       for(int i = 0; i < 10000; i++) {
          // c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 => 3ms
          // c += a + b + "\n"; // 500 => 14ms, 1000 => 16ms
           sb.append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 0ms

           // append concatena
       }

       long fin = System.currentTimeMillis();
       System.out.println(fin - inicio);
       System.out.println("c = " + c);
       System.out.println("sb = " + sb.toString());
    }
}
