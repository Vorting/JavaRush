package JavaSyntax.lecture2;

public class CircleLengthDemo {

    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        double Pi = 3.14;
        double circleLength = 2 * Pi * radius;
        System.out.println("The circle length is: " + circleLength);

    }
}
