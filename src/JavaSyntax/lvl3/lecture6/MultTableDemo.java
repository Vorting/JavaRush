package JavaSyntax.lvl3.lecture6;

public class MultTableDemo {
    public static void main(String[] args) {

        final int line = 10, column = 10;
        int[][] matrice = new int[line][column];

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = (i + 1) * (j + 1);
                System.out.printf("%5d", matrice[i][j]);
            }
            System.out.println();
        }
    }
}
