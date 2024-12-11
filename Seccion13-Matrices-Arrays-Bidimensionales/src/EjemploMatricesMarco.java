public class EjemploMatricesMarco {
    public static void main(String[] args) {

        String[][] matriz = new String[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 || i == matriz.length - 1 || j == 0 || j == matriz[i].length - 1 || i == j) {
                    matriz[i][j] = "*";
                } else {
                    matriz[i][j] = "-";
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
