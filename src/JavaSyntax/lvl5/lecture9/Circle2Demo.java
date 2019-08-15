package JavaSyntax.lvl5.lecture9;

public class Circle2Demo {
    public double x;
    public double y;
    public double radius;

    public Circle2Demo(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle2Demo(double x, double y) {

        this(x, y, 10);
    }

    public Circle2Demo() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Circle2Demo circle = new Circle2Demo();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle2Demo anotherCircle = new Circle2Demo(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}
