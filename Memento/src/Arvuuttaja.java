import java.util.Random;

public class Arvuuttaja {
    private int secretNumber;

    public Arvuuttaja() {
        Random random = new Random();
        secretNumber = random.nextInt(100);
    }

    public Memento liityPeliin() {
        return new Memento(secretNumber);
    }

    public boolean tarkistaArvaus(Memento memento, int arvaus) {
        int storedNumber = memento.getNumber();
        return arvaus == storedNumber;
    }
}