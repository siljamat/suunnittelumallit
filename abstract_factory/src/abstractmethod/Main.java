package abstractmethod;

public class Main {

	public static void main(String[] args) {
		Vaatetehdas adidastehdas = new Adidastehdas();
        Vaatetehdas bosstehdas = new Bosstehdas();

        Koodari jasperi = new Koodari(adidastehdas);
        jasperi.näytäPukeutuminen();

        // Valmistumisen jälkeen vaihto Boss-tehtaaseen
        jasperi.setTehdas(bosstehdas);
        jasperi.näytäPukeutuminen();
    }
}
