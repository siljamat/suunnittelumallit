package singleton;

public class Asetukset {
    private static Asetukset instance;
    private String kieli;
    private int fonttikoko;

    // Yksityinen konstruktori estää ulkopuolisia instanssin luomasta
    private Asetukset() {
        this.kieli = "suomi";
        this.fonttikoko = 12;
    }

    public static Asetukset getInstance() {
        if (instance == null) {
            instance = new Asetukset();
        }
        return instance;
    }

    public String getKieli() {
        return kieli;
    }

    public void setKieli(String kieli) {
        this.kieli = kieli;
    }

    public int getFonttikoko() {
        return fonttikoko;
    }

    public void setFonttikoko(int fonttikoko) {
        this.fonttikoko = fonttikoko;
    }
}
