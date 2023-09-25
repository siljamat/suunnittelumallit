public class Salami extends Taytteet {

    double hinta = 4.50;
    public Salami (IPizza pizza){
        super(pizza);
    }

    public double haeHinta() {
        return pizza.haeHinta() + hinta;
    }

    @Override
    public String haeTiedot() {
        return super.haeTiedot() + "salami " + haeHinta() + " €, ";
    }
}
