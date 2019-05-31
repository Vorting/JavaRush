package JavaSyntax.lecture8;

public class ArtifactDemo {
    private int centuryAge;
    private String culture;
    private int indexNumber;

    public ArtifactDemo(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public ArtifactDemo(String culture, int indexNumber) {
        this.culture = culture;
        this.indexNumber = indexNumber;
    }

    public ArtifactDemo(String culture, int centuryAge, int indexNumber) {
        this.culture = culture;
        this.indexNumber = indexNumber;
        this.centuryAge = centuryAge;

    }

    public static void main(String[] args) {
        ArtifactDemo artifact1 = new ArtifactDemo(1);
        ArtifactDemo artifact2 = new ArtifactDemo("Ацтеки", 21);
        ArtifactDemo artifact3 = new ArtifactDemo("Ацтеки", 12, 500);

        System.out.println(artifact1.indexNumber);
        System.out.println(artifact2.culture + " " + artifact2.indexNumber);
        System.out.println(artifact3.culture + " " + artifact3.indexNumber);
    }
}
