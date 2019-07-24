package JavaSyntax.lvl4.lecture13;

public class TriangleDemo {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) { // 1-ым циклом перебираем строки
            if (i == 0) {
                continue;
            }
            for (int j = 0; j <= 10; j++) { // 2-ым циклом перебираем столбцы
                if (j == i ) {
                    break;
                }
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
