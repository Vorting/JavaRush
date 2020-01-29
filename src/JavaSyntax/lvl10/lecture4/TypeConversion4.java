package JavaSyntax.lvl10.lecture4;

public class TypeConversion4 {
    public static void main(String[] args) {
        short number = 9;
        char zero = (int) '0';
        int nine = (zero + number);
        System.out.println((char) nine);
    }
}
