package abstractmethod;

public abstract class Henkilo {
	private Vaatetehdas tehdas;
    private Housut housut;
    private Tpaita tpaita;
    private Lippis lippis;
    private Kengat kengat;

    public Henkilo(Vaatetehdas tehdas) {
        this.tehdas = tehdas;
        pukeudu();
    }

    public void setTehdas(Vaatetehdas tehdas) {
        this.tehdas = tehdas;
        pukeudu();
    }

    public void pukeudu() {
        housut = tehdas.makeHousut();
        tpaita = tehdas.makeTpaita();
        lippis = tehdas.makeLippis();
        kengat = tehdas.makeKengat();
    }

    public void näytäPukeutuminen() {
        System.out.println("Henkilö on pukeutunut:");
        System.out.println(housut);
        System.out.println(tpaita);
        System.out.println(lippis);
        System.out.println(kengat);
    }
}
