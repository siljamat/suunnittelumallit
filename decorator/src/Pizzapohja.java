public class Pizzapohja implements IPizza {

    double hinta = 6.00;

    public double haeHinta() {
        return hinta;
    }

    @Override
    public String haeTiedot() {
        return "pohja " + haeHinta() + " €, ";
    }
}
