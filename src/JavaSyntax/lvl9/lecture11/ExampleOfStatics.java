package JavaSyntax.lvl9.lecture11;

public class ExampleOfStatics {

    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        ExampleOfStatics room = new ExampleOfStatics();
        room.A = 5;

        ExampleOfStatics.D = 5;
    }

    public int getA() {
        return A;
    }

}
