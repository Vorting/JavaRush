package JavaSyntax.lvl5.lecture5;

public class PersonDemo {
    private String name;
    private int age;
    private char sex;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {
        PersonDemo person = new PersonDemo();
    }
}
