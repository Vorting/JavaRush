package JavaSyntax.lvl10.lecture4;

public class TypeConversion3 {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (int) (i + (byte) f);

        System.out.println(b);
    }
}
