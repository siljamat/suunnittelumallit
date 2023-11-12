public class IlmoitusAdapteri implements UusiIlmoitus {
    private Tekstiviesti tekstiviesti;

    public IlmoitusAdapteri() {
        this.tekstiviesti = new Tekstiviesti();
    }

    @Override
    public void lahetaIlmoitus(String viesti) {
        tekstiviesti.lahetaTekstiviesti(viesti);
    }
}