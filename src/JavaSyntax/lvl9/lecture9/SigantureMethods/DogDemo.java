package JavaSyntax.lvl9.lecture9.SigantureMethods;

public class DogDemo {
    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public DogDemo(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        DogDemo dog = new DogDemo("Фидо");
        try {


            dog.putMuzzle();
            dog.putLeash();
            dog.putCollar();
            dog.walk();
        } catch (DogIsNotReadyException ex) {
            System.out.println("Наш пёсик замерзнет! " + ex);
        }

    }

    public void putCollar() {
        System.out.println("Ошейник надет!");
        this.isCollarPutOn = true;
    }

    public void putLeash() {
        System.out.println("Поводок надет!");
        this.isLeashPutOn = false;
    }

    public void putMuzzle() {
        System.out.println("Намордник надет!");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException {
        System.out.println("Собираемся на прогулку!");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("Ура, идем гулять!" + name + " очень рад!");
        } else {
            throw new DogIsNotReadyException("Собака " + name +
                    " не готова к прогулке! Проверьте экипировку");
        }
    }

    private class DogIsNotReadyException extends Exception {
        public DogIsNotReadyException(String message) {
            super(message);
        }
    }
}
