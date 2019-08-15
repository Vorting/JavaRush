package JavaSyntax.lvl5.lecture7;

public class RectangleDemo {
    private int top;
    private int left;
    private int width;
    private int height;

    public static void main(String[] args) {
        RectangleDemo rectangle = new RectangleDemo();
        RectangleDemo rectangle2 = rectangle;

        rectangle.initialize(5, 5, 5, 5);
        System.out.println(rectangle.top + "\n" + rectangle.left + "\n" + rectangle.width + "\n" + rectangle.height);

        System.out.println();

        rectangle.initialize(10, 10, 0, 0);
        System.out.println(rectangle.top + "\n" + rectangle.left + "\n" + rectangle.width + "\n" + rectangle.height);

        System.out.println();

        rectangle.initialize(4, 4, 0, 0);
        System.out.println(rectangle.top + "\n" + rectangle.left + "\n" + rectangle.width + "\n" + rectangle.height);
    }

    public void initialize(int top) {
        this.top = top;
    }

    public void initialize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
}
