import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int pelaajienMaara = 5;
        ExecutorService executorService = Executors.newFixedThreadPool(pelaajienMaara);

        for (int i = 1; i <= pelaajienMaara; i++) {
            final int pelaajaNumero = i;
            executorService.execute(() -> {
                Arvuuttaja arvuuttaja = new Arvuuttaja();
                Memento asiakkaanMemento = arvuuttaja.liityPeliin();
                int alaraja = 1;
                int ylaraja = 100;

                while (true) {
                    int arvaus = (ylaraja + alaraja) / 2;
                    System.out.println("Pelaaja " + pelaajaNumero + " arvaus: " + arvaus);

                    if (arvuuttaja.tarkistaArvaus(asiakkaanMemento, arvaus)) {
                        System.out.println("Pelaaja " + pelaajaNumero + " arvasi oikein. Oikea numero oli: " + asiakkaanMemento.getNumber());
                        break;
                    } else if (arvaus < asiakkaanMemento.getNumber()) {
                        System.out.println("Arvattu luku on suurempi.");
                        alaraja = arvaus + 1;
                    } else {
                        System.out.println("Arvattu luku on pienempi.");
                        ylaraja = arvaus - 1;
                    }
                }
            });
        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS); //odottaa, että kaikki säikeet ovat lopettaneet toimintansa
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}