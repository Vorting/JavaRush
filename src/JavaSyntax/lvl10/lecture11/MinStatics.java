package JavaSyntax.lvl10.lecture11;

public class MinStatics {

    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    private static int D = 5;

    public static void main(String[] args) {
        MinStatics minStatics = new MinStatics();
        minStatics.A = 5;
        minStatics.B = 5 * B;
        minStatics.C = 5 * C * D;
        minStatics.D = 5 * D * C;

        minStatics.D = 5;
    }

    public int getA() {
        return A;
    }
}
