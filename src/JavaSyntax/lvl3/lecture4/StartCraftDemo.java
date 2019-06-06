package JavaSyntax.lvl3.lecture4;

public class StartCraftDemo {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        System.out.println(zerg1.name = "ZerMorpheus");

        Zerg zerg2 = new Zerg();
        System.out.println(zerg2.name = "ZerKratos");

        Zerg zerg3 = new Zerg();
        System.out.println(zerg3.name = "ZerBenjamin");

        Zerg zerg4 = new Zerg();
        System.out.println(zerg4.name = "ZerValerus");

        Zerg zerg5 = new Zerg();
        System.out.println(zerg5.name = "ZerLohovic");

        Protoss protoss1 = new Protoss();
        System.out.println(protoss1.name = "ProGamnotoss");

        Protoss protoss2 = new Protoss();
        System.out.println(protoss2.name = "ProNagibotoss");

        Protoss protoss3 = new Protoss();
        System.out.println(protoss3.name = "ProMolodocoss");

        Terran terran1 = new Terran();
        System.out.println(terran1.name = "Terra");

        Terran terran2 = new Terran();
        System.out.println(terran2.name = "Terrapopus");

        Terran terran3 = new Terran();
        System.out.println(terran3.name = "Terrachokus");

        Terran terran4 = new Terran();
        System.out.println(terran4.name = "Terrabokus");
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }

}
