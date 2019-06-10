package JavaSyntax.lvl3.lecture4;

public class ProdNumDemo {
    public static void main(String[] args) {
        System.out.println(pow(10));
    }

    public static int pow(int i) {
        int res = 1;

        for (int j = 1; j <= i; j++) {
            res *= j;

        }
        return res;
    }
}

