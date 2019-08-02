package JavaSyntax.lvl5.lecture9;

public class Circle3Demo {

    public double x;
    public double y;
    public double radius;

    public Circle3Demo(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle3Demo(double x, double y) {
        this.x = x;
        this.y = y;
        
    }

    public Circle3Demo() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Circle3Demo circle = new Circle3Demo();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle3Demo anotherCircle = new Circle3Demo(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}