package JavaSyntax.lvl10.lecture4;

public class TypeConversion2 {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = (float) a / b;
        double d = a * 1e-3 + c;

        System.out.println(d);
    }
}
