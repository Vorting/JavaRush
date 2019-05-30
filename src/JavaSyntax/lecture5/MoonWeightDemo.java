package JavaSyntax.lecture5;

public class MoonWeightDemo {
    public static void main(String[] args) {

        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        double on_moon = 0.17;

        return earthWeight*on_moon;
    }
}
